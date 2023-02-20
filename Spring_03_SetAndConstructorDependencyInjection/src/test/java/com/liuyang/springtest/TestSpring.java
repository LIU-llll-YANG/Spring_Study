package com.liuyang.springtest;

import com.liuyang.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试 set注入
     */
    @Test
    public void test_01_setInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("student1", Student.class);
        System.out.println("student = " + student);
    }
    
    /**
     * 测试 构造器注入
     */
    @Test
    public void test_02_constructorInjection(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ctx.getBean("student2", Student.class);
        System.out.println("student = " + student);
    }
}
