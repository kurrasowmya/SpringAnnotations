package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    @Value("${actor.actorName}")
    String actorName;
    @Value("${actor.gender}")
    String gender;
    @Value("${actor.age}")
    int age;

    public void displayinfo()
    {
        System.out.println("Actor name: " +actorName+ "Gender:" +gender+ " age:" +age );
    }


}
