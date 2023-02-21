package com.liuyang.spring;

import com.liuyang.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试 基于注解的自动装配
     */
    @Test
    public void test_01_BasedOnAnnotationAutomaticAssemb(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserController userController = ctx.getBean(UserController.class);
        userController.save();

    }
}
