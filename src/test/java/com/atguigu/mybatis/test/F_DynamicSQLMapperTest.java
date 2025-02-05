package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class F_DynamicSQLMapperTest {

    /**
     * 动态SQL:
     * 1. if: 根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
     * 2. where: 当where标签中有内容时，会自动生成where关键字，并且将内容前多余的and或or去掉
     * 当where标签中没有内容时，此时where没有任何效果
     * 注意: where不能将其中内容后面多余的and或or去掉
     * 3. trim:
     * 若标签中有内容时:
     * prefix|suffix: 将trim标签中内容前面或后面添加指定内容
     * suffixOverrides|prefixOverrides: 将trim标签中内容前面或后面去掉指定内容
     * 若标签中没有内容时，trim标签也没有任何效果
     * 4. choose, when, otherwise 相当于 if...else if...else
     * when至少要有一个，otherwise最多只能有一个
     * 5. foreach
     * collection: 设置需要循环的数组或集合
     * item: 表示数值或集合中的每一个数据
     * separator: 循环体之间的分隔符
     * open: foreach标签所循环的所有内容的开始符
     * close: foreach标签所循环的所有内容的结束符
     */

    @Test
    public void testGetEmpsByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpsByCondition(new Emp(null, "张三", null, "", null));
        System.out.println(list);
    }

    @Test
    public void testGetEmpsByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpsByChoose(new Emp(null, "", null, "", null));
        System.out.println(list);
    }

    @Test
    public void testDeleteMultipleByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMultipleByArray(new Integer[]{9, 10, 11});
        System.out.println(result);
    }

    @Test
    public void testInsertMultipleByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "123@qq.com");
        Emp emp2 = new Emp(null, "a2", 23, "男", "123@qq.com");
        Emp emp3 = new Emp(null, "a3", 23, "男", "123@qq.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        System.out.println(mapper.insertMultipleByList(emps));
    }
}
