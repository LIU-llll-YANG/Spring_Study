package com.liuyang.springtest;

import com.liuyang.spring.pojo.Clazz;
import com.liuyang.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试为集合类型属性进行赋值
     */
    @Test
    public void test_01_ForCollectionTypeAttributeAssignment(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Clazz clazz = ctx.getBean("clazz", Clazz.class);
        System.out.println("clazz = " + clazz);

    }
    
    /**
     * 测试Map集合类型属性赋值
     */
    @Test
    public void test_02_ForMapCollectionPropertyAssignment(){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Student student = ctx.getBean("student", Student.class);
        System.out.println("student = " + student);
    }
}
