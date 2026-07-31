package com.yourname.demo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {
    // 空的！继承 BaseMapper 就自动有了 CRUD
}