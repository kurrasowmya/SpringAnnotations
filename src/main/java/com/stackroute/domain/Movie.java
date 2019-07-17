package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {


    @Autowired
    private Actor actor;
    //Autowired annotation on variable/setters is equivalent to autowire="byType"
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display()
    {
        actor.displayinfo();
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    public void setBeanName(String s) {
        System.out.println("name"+s);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
