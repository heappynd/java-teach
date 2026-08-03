package com.yourname.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.yourname.demo.entity.User;
import com.yourname.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public Page<User> pageList(long page, long size, String name, String email) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(name != null && !name.isEmpty(), User::getName, name)
               .like(email != null && !email.isEmpty(), User::getEmail, email)
               .orderByDesc(User::getId);
        return page(new Page<>(page, size), wrapper);
    }

    @Override
    public User createUser(User user) {
        long count = count(new LambdaQueryWrapper<User>()
                .eq(User::getEmail, user.getEmail()));
        if (count > 0) {
            throw new IllegalArgumentException("邮箱已被注册: " + user.getEmail());
        }
        save(user);
        return user;
    }
}
