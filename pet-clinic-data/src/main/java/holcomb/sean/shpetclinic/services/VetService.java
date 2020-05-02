package holcomb.sean.shpetclinic.services;

import holcomb.sean.shpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet fingById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
