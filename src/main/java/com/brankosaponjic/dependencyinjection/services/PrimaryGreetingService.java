package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Greetings from the PRIMARY Bean!";
    }
}
