package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("dog")
@Profile({"dog", "default"})
public class DogPetBrokenServiceImpl implements PetBrokenService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
