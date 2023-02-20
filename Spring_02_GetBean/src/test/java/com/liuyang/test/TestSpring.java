package com.liuyang.test;

import com.liuyang.spring.Spring_Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试 通过id获取bean
     */
    @Test
    public void test_01_getBeanById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Spring_Hello springHello = (Spring_Hello) applicationContext.getBean("springHello");
        springHello.helloSpring();


    }


    /**
     * 测试 通过id和 class获取bean
     */
    @Test
    public void test_02_getBeanByIdAndClass(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Spring_Hello springHello = applicationContext.getBean("springHello", Spring_Hello.class);
        springHello.helloSpring();

    }
}
