package com.example.subsidieradar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cofinanciering extends Subsidie implements Serializable {
    double maxSubsidiebedrag;

    public Cofinanciering(String naam, String subsidieverstrekker, String subsidialeActiviteiten, Date maxLooptijd,
            double subsidieBudget, Date startDatum, Date deadline, String beoordelingssystematiek,
            String subsidieWebsiteLink, int matchPercentage, iMatch match) {
        super(naam, subsidieverstrekker, subsidialeActiviteiten, maxLooptijd, subsidieBudget, startDatum, deadline,
                beoordelingssystematiek, subsidieWebsiteLink);
    }

    public Cofinanciering() {

    }
}
