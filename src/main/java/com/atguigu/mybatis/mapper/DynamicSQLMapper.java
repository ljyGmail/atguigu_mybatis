package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * 多条件查询
     */
    List<Emp> getEmpsByCondition(Emp emp);
}
