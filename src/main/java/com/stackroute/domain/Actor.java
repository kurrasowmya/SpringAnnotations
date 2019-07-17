package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    String name;

    String gender;

    int age;
    public Actor(String name,String gender,int age)
    {
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void displayinfo()
    {
        System.out.println("Actor name:"+name+ "Gender:" +gender+ " age:" +age );
    }


}
