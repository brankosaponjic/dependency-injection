package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.ImplProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new ImplProperty());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}