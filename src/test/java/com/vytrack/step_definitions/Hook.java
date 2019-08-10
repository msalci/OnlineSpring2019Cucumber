package com.vytrack.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");

//        [@storemanager,@VYT-4121]
//        Login as a store manager
//                BEFORE
//        configuration.properties
//        [@negative, @storemanager]
//        Verify warning message for invalid credentials
//        BEFORE
    }

    @After
    public void teardown(){
        System.out.println("AFTER");
    }
}
