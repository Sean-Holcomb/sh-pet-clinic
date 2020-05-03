package holcomb.sean.shpetclinic.services;

import holcomb.sean.shpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    Vet findByLastName(String lastName);

}
