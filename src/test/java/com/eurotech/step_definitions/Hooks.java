package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {


    @Before
    public void setup(){
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // System.out.println("This is coming from before");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
      //  System.out.println("This is coming from after");
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
