package com.liuyang.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法:"+ beanName +"--"+ bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("销毁方法:"+ beanName +"--"+ bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
