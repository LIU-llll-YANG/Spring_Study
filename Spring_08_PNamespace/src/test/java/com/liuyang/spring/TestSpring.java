package com.liuyang.spring;

import com.liuyang.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试p命名空间
     */
    @Test
    public void test_01_PNamespace(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Student student = ctx.getBean("student", Student.class);
        System.out.println("student = " + student);
    }
}
