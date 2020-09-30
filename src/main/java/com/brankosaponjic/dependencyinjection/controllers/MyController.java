package com.brankosaponjic.dependencyinjection.controllers;

import newpackage.services.GreetingServiceImplItalian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingServiceImplItalian italian;

    @Autowired
    public MyController(GreetingServiceImplItalian italian) {
        this.italian = italian;
    }

    public String sayHelloToSpring() {
//        System.out.println("Hello Spring 5 Framework!");
        System.out.println(italian.greeting());

        return "Hi everybody!";
    }
}
