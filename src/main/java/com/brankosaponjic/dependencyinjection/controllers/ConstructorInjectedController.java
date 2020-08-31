package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // constructor
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // getter method
    public String getGreeting() {
        return greetingService.greeting();
    }
}
