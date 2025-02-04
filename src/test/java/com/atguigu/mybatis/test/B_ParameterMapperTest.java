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
}
