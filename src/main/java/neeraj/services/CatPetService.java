package neeraj.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CAT")
@Service("petTypeService")
public class CatPetService implements PetService {
    @Override
    public String petType() {
        return "Cats are the best";
    }
}
