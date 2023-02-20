package com.liuyang.spring;

import com.liuyang.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试 工厂bean
     */
    @Test
    public void test_01_FactoryBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = ctx.getBean(User.class);
        System.out.println("user = " + user);
    }
}
