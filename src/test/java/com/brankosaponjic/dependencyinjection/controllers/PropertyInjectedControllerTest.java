package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.ImplConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ImplConstructor();
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}