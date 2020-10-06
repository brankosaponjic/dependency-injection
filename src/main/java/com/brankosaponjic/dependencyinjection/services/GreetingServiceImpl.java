package com.brankosaponjic.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello everybody!";
    }
}
