package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
        BeanPostProcessorDemoBean beanpostprocessor = annotationConfigApplicationContext.getBean("BeanPostProcessorDemoBean", BeanPostProcessorDemoBean.class);
        beanpostprocessor.customInit();
        beanpostprocessor.customDestroy();


    }
}