package neeraj.springframework.sfndi.controller;

import neeraj.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PetController {
    private final PetService petService;

    public PetController(@Qualifier("petTypeService") PetService petService) {
        this.petService = petService;
    }

    public String bestPetType(){
        return petService.petType();
    }
}
