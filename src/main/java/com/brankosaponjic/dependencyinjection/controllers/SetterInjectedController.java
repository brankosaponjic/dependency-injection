package com.brankosaponjic.dependencyinjection.controllers;

import newpackage.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    // setter method
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // getter method
    public String getGreeting() {
        return greetingService.greeting();
    }
}
