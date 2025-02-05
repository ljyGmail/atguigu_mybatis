package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * 多条件查询
     */
    List<Emp> getEmpsByCondition(Emp emp);

    /**
     * 测试choose, when, otherwise
     */
    List<Emp> getEmpsByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     */
    int deleteMultipleByArray(@Param("eids") Integer[] eids);

    /**
     * 通过list集合实现批量添加
     */
    int insertMultipleByList(@Param("emps") List<Emp> emps);
}
