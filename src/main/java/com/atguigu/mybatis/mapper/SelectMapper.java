package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {

    /**
     * 根据id查询用户信息
     */
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     */
    List<User> getAllUsers();

    /**
     * 查询用户信息的总记录数
     */
    Integer getCount();
}
