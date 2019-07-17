package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="com.stackroute.domain")
@PropertySource("classpath:actorinfo.properties")
public class MovieConfiguration {
    @Bean(name="BeanPostProcessorDemoBean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanPostProcessorDemoBean getBeanpostprocessor()
    {
        return new BeanPostProcessorDemoBean();
    }




}
