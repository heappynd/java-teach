package com.yourname.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourname.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
