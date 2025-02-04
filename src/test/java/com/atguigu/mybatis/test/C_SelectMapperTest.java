package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class C_SelectMapperTest {

    /**
     * MyBatis各种查询功能
     * 1. 若查询出的数据只有一条
     * a> 可以通过实体类对象接收
     * b> 可以通过list集合接收
     * c> 可以通过list集合接收
     * 2. 若查询出的数据有多条
     * a> 可以通过list集合接收
     * b>
     * 注意: 一定不能通过实体类对象接收，此时会抛异常: TooManyResultsException
     */
    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(3));
    }

    @Test
    public void testGetAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUsers());
    }
}
