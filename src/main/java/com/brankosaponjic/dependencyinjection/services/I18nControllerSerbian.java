package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"СР", "default"})
@Service("i18nService")
public class I18nControllerSerbian implements GreetingService {
    @Override
    public String greeting() {
        return "Здраво свете! - СР";
    }
}
