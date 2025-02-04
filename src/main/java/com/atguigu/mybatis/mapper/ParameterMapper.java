package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface ParameterMapper {

    /**
     * 查询所有的员工信息
     */
    List<User> getAllUsers();

    /**
     * 根据用户名查询用户信息
     */
    User getUserByUsername(String username);
}
