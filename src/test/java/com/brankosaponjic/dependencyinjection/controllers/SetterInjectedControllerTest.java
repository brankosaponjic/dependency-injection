package com.brankosaponjic.dependencyinjection.controllers;

import newpackage.services.GreetingServiceImplSerbian;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new GreetingServiceImplSerbian());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}