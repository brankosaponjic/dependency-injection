package com.brankosaponjic.dependencyinjection.controllers;

import newpackage.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    // getter method
    public String getGreeting() {
        return greetingService.greeting();
    }
}
