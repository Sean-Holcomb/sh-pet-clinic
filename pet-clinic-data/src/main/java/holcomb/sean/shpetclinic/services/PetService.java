package holcomb.sean.shpetclinic.services;

import holcomb.sean.shpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet fingById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
