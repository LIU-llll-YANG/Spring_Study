package com.liuyang.springtest;

import com.liuyang.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试bean的生命周期
     */
    @Test
    public void test_01_BeanLifecycle() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println("user = " + user);
        ctx.close();

    }
}
