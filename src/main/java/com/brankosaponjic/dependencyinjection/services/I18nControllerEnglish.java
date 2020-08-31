package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nControllerEnglish implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - EN";
    }
}
