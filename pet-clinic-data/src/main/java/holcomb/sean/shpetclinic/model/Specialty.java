package holcomb.sean.shpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
