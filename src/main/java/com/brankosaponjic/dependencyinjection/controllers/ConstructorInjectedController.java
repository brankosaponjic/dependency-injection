package com.brankosaponjic.dependencyinjection.controllers;

import newpackage.services.GreetingService;

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
