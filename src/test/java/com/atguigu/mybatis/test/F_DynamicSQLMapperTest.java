package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class F_DynamicSQLMapperTest {

    /**
     * 动态SQL:
     * 1. if: 根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
     */

    @Test
    public void testGetEmpsByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpsByCondition(new Emp(null, "张三", 23, "男", "123@qq.com"));
        System.out.println(list);
    }
}
