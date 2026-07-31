package com.yourname.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

//    @GetMapping
//    public List<User> getAll() {
//        return userMapper.selectList(null);
//    }

    @GetMapping
    public Page<User> getList(
            @RequestParam(defaultValue = "1") long page,
            @RequestParam(defaultValue = "10") long size,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
            ) {
        Page<User> pageObj = new Page<>(page, size);

        // 2. 构建查询条件
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(name != null && !name.isEmpty(), User::getName, name)
                .like(email != null && !email.isEmpty(), User::getEmail, email)
                .orderByDesc(User::getId);

        return userMapper.selectPage(pageObj, wrapper);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userMapper.selectById(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        userMapper.insert(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        userMapper.deleteById(id);
        return "Deleted user " + id;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userMapper.updateById(user);
        return userMapper.selectById(id);
    }
}
