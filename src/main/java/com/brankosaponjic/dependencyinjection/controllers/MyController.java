package com.brankosaponjic.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHelloToSpring() {
        System.out.println("Hello Spring 5 Framework!");

        return "Hi everybody!";
    }
}
