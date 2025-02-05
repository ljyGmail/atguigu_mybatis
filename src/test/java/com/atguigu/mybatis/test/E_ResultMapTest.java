package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class E_ResultMapTest {

    /**
     * 解决字段名与属性名不一致的情况:
     * a> 为字段起别名，保持和属性名的一致
     * b> 设置全局配置，将_自动映射为驼峰
     * <setting name="mapUnderscoreToCamelCase" value="true"/>
     * c> 通过resultMap设置自定义的映射关系
     * <resultMap id="empResult" type="Emp">
     * <id property="eid" column="eid"/>
     * <result property="empName" column="emp_name"/>
     * <result property="age" column="age"/>
     * <result property="sex" column="sex"/>
     * <result property="email" column="email"/>
     * </resultMap>
     * <p>
     * 处理多对一的映射关系:
     * a> 级联属性赋值
     */

    @Test
    public void testGetAllEmps() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmps();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }
}
