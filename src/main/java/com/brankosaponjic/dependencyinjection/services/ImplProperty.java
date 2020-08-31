package com.brankosaponjic.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ImplProperty implements GreetingService {
    @Override
    public String greeting() {
        return "Hello everybody! - Property";
    }
}
