package com.liuyang.spring;

import com.liuyang.spring.dynamicproxy.Calculator;
import com.liuyang.spring.dynamicproxy.CalculatorImpl;
import com.liuyang.spring.dynamicproxy.ProxyFactory;
import org.junit.Test;

public class TestSpring {
    /**
     * 测试动态代理
     */
    @Test
    public void test_01_DynamicProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator o = (Calculator) proxyFactory.getProxy();
        o.add(1,3);
    }
}
