package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    private Actor actor;

    public void display()
    {
        actor.displayinfo();
    }

}
