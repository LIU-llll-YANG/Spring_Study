package com.liuyang.spring.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class ProxyFactory{
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //获取代理对象的方法
    public Object getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("------------------------------------");
                Object result = method.invoke(target, args);
                System.out.println("+++++++++++++++++++++++");
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
