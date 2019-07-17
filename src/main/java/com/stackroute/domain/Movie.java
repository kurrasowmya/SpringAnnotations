package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    @Autowired
    private Actor actor;
    //Autowired annotation on variable/setters is equivalent to autowire="byType"
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("Autowiring bytype used");
    }
    //Autowired annotation on Constructor is equivalent to autowire="constructor"
    @Autowired(required=false)
    public Movie( Actor actor){
        this.actor=actor;
        System.out.println("Autowiring by constructor used");
    }

    public void display()
    {
        actor.displayinfo();
    }

}
