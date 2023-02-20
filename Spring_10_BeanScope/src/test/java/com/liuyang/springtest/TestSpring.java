package com.liuyang.springtest;

import com.liuyang.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试bean的作用域 
     */
    @Test
    public void test_01_BeanScope(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = ctx.getBean("user", User.class);


    }
}
