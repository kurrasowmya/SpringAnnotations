package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="com.stackroute.domain")
@PropertySource("classpath:actorinfo.properties")
public class MovieConfiguration {
   /* @Bean
    public Movie movie()
    {
        return new Movie();
    }*/
}
