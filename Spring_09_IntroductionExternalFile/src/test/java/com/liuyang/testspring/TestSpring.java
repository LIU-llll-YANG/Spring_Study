package com.liuyang.testspring;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestSpring {
    /**
     * 测试引入外部文件
     */
    @Test
    public void test_01_IntroductionExternalFile() throws SQLException {
         ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        DruidDataSource druidDataSource = ctx.getBean("druidDataSource", DruidDataSource.class);
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
