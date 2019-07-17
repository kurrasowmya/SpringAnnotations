package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
    public void destroy() throws Exception {

    }

    public void afterPropertiesSet() throws Exception {

    }
    public void customInit()
    {
        System.out.println("customInit() called");
    }

    public void customDestroy()
    {
        System.out.println("customDestroy() called , closing opened resources");
    }

}
