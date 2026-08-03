package com.yourname.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.spring.service.IService;
import com.yourname.demo.entity.User;

public interface UserService extends IService<User> {

    Page<User> pageList(long page, long size, String name, String email);

    User createUser(User user);
}
