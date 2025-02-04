package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询所有的员工信息
     */
    List<Emp> getAllEmps();
}
