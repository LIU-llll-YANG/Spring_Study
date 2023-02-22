package com.liuyang.spring;

import com.liuyang.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 测试 增加方法
     */
    @Test
    public void test_01_JdbcTemplate(){
        String sql = "insert into t_user values(null,?,?)";
        int update = jdbcTemplate.update(sql, "刘洋", "123456");
        System.out.println("update = " + update);
    }

    /**
     * 测试 查询一条数据
     */
    @Test
    public void test_02_QueryOneUser(){
        String sql = "select * from t_user where id  = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println("user = " + user);

    }

    /**
     * 测试 查询多个数据为一个集合
     */
    @Test
    public void test_03_QueryUsers(){
        String sql = "select * from t_user";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        users.forEach(System.out::println);

    }
    
    /**
     * 测试 查询单行单列的值
     */
    @Test
    public void test_04_QueryValueSingleLine(){
       String sql = "SELECT COUNT(*) FROM t_user";
        Integer query = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("query = " + query);
    }
}
