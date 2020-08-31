package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Autowired
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
