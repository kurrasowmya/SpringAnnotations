package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="com.stackroute.domain")
@PropertySource("classpath:actorinfo.properties")
public class MovieConfiguration {
    @Bean(name="BeanLifecycleDemoBean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifecycledemoBean()
    {
        return new BeanLifecycleDemoBean();
    }




}
