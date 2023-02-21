package com.liuyang.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试自动装配
     */
    @Test
    public void test_01_BasedOnAnnotationManagementBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //UserController userController = ctx.getBean(UserController.class);
        //System.out.println("userController = " + userController);
        //UserServiceImpl userService = ctx.getBean(UserServiceImpl.class);
        //System.out.println("userService = " + userService);
        //UserDao userDao = ctx.getBean(UserDao.class);
        //System.out.println("userDao = " + userDao);

        Object userService = ctx.getBean("userService");
        System.out.println("userService = " + userService);


    }
}
