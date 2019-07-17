package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="com.stackroute.domain")
public class MovieConfiguration {
   @Bean("actor")
    public Actor actor()
    {
        Actor actor1=new Actor("Ram","male",26);
        return actor1;
    }
    @Bean("movie1")
    @Scope(value="prototype")
    public Movie movie1()
    {
        return new Movie(actor());
    }
    @Bean("actor2")
    public Actor actor2()
    {
        Actor actor2=new Actor("sam","female",24);
        return actor2;
    }
    @Bean("movie2")
    @Scope(value="prototype")
    public Movie movie2()
    {
        return new Movie(actor2());
    }

}
