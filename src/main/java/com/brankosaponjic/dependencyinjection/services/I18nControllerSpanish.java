package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nControllerSpanish implements GreetingService{
    @Override
    public String greeting() {
        return "Hola Mundo! - ES";
    }
}
