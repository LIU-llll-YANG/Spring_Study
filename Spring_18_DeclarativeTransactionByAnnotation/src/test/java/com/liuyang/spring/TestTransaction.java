package com.liuyang.spring;

import com.liuyang.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTransaction {
    @Autowired
    private BookController bookController;

    /**
     * 测试 没有加事务的情况
     */
    @Test
    public void test_01_NoTransaction(){

        bookController.buyBook(1,2);
    }
}
