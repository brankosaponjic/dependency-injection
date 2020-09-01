package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service("petService")
public class DogPetBrokenServiceImpl implements PetBrokenService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
