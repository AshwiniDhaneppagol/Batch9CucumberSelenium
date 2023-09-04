package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup(){
        System.out.println("This is coming from before");
    }

    @After
    public void tearDown(){
        System.out.println("This is coming from after");
    }

    @Before("@db")
    public void setupDb(){
        System.out.println("This is coming from before and connecting DB");
    }

    @After("@db")
    public void closeDb(){

        System.out.println("This is coming from After and closing DB");
    }
}
