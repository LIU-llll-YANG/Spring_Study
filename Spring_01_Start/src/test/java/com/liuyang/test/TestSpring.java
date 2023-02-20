package com.liuyang.test;

import com.liuyang.spring.Spring_Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试Spring入门案例
     */
    @Test
    public void test_01_SpringHello(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Spring_Hello springHello = applicationContext.getBean("springHello", Spring_Hello.class);
        springHello.helloSpring();
    }
}
