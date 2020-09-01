package com.brankosaponjic.dependencyinjection.controllers;

import com.brankosaponjic.dependencyinjection.services.PetBrokenService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetBrokenController {

    private final PetBrokenService petBrokenService;

    public PetBrokenController(@Qualifier("petService") PetBrokenService petBrokenService) {
        this.petBrokenService = petBrokenService;
    }

    public String whichPetIsTheBest(){
        return petBrokenService.getPetType();
    }

}
