package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("implProperty")
    @Autowired
    public GreetingService greetingService;

    // getter method
    public String getGreeting() {
        return greetingService.greeting();
    }
}
