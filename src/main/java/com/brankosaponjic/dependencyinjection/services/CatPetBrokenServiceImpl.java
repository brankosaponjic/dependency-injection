package com.brankosaponjic.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("cat")
public class CatPetBrokenServiceImpl implements PetBrokenService {
    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
