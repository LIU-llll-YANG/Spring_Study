package com.liuyang.spring;

import com.liuyang.spring.aspcet.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试切面 前置通知
     */
    @Test
    public void test_01_BeforeAdvice(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Calculator calculator = ctx.getBean(Calculator.class);
        int result = calculator.div(1, 1);
        System.out.println("result = " + result);
    }
}
