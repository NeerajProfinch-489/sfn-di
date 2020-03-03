package neeraj.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DOG","default"})
@Service("petTypeService")
public class DogPetService implements PetService {
    @Override
    public String petType() {
        return "Dogs Are the Best";
    }
}
