package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
        BeanLifecycleDemoBean beanlifecycle = annotationConfigApplicationContext.getBean("BeanLifecycleDemoBean", BeanLifecycleDemoBean.class);
        beanlifecycle.customInit();
        beanlifecycle.customDestroy();


    }
}