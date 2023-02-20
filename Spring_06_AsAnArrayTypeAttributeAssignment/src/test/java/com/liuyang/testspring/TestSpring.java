package com.liuyang.testspring;

import com.liuayng.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试 为数组类型属性进行赋值
     */
    @Test
    public void test_01_asAnArrayTypeAttributeAssignment() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Student student = ctx.getBean(Student.class);
        System.out.println("student = " + student);

    }
}
