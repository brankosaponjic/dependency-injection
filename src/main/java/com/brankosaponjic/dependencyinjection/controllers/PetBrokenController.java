package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.PetBrokenService;

public class PetBrokenController {

    private final PetBrokenService petBrokenService;

    public String whichPetIsTheBest(){
        return petBrokenService.getPetType();
    }

}
