package com.brankosaponjic.dependencyinjection.services;

public class GreetingServiceImplItalian implements GreetingService {
    @Override
    public String greeting() {
        return "Ciao Tutti!";
    }
}
