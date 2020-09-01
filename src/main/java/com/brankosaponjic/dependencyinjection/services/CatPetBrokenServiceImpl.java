package com.brankosaponjic.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("petService")
public class CatPetBrokenServiceImpl implements PetBrokenService {
    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
