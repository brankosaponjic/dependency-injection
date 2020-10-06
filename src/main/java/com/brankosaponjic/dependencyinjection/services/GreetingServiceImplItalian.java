package com.brankosaponjic.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplItalian implements GreetingService {
    @Override
    public String greeting() {
        return "Ciao Tutti!";
    }
}
