package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class B_ParameterMapperTest {

    /**
     * MyBatis获取参数值的两种方式: ${}和#{}
     * ${}: 本质是字符串拼接
     * #{}: 本质是占位符赋值
     * MyBatis获取参数值的各种情况:
     * 1. mapper接口方法的参数为单个的字面量类型
     * 可以通过${}和#{}以任意的名称来获取参数值，但是需要注意${}的单引号问题
     */

    @Test
    public void getAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUsers();
        list.forEach(System.out::println);
    }

    /*
    @Test
    public void testJDBC() throws Exception {
        String username = "admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
        // PreparedStatement ps = connection.prepareStatement("select * from t_user where username = '" + username + "'");
        PreparedStatement ps = connection.prepareStatement("select * from t_user wher username = ?");
        ps.setString(1, username);
    }
    */

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }
}
