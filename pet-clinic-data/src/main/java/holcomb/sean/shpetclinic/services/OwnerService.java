package holcomb.sean.shpetclinic.services;

import holcomb.sean.shpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
