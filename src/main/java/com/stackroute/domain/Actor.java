package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
  /*  public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    @Value("${actor.name}")
    String name;
    @Value("${actor.gender}")
    String gender;
    @Value("${actor.age}")
    int age;


    public void displayinfo()
    {
        System.out.println("Actor name:"+name+ "Gender:" +gender+ " age:" +age );
    }


}
