package com.liuyang.testspring;

import com.liuyang.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试 引用类型属性赋值的方式
     */
    @Test
    public void test_01_referenceTypes(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Student student = ctx.getBean("student", Student.class);
        System.out.println("student = " + student);

    }
}
