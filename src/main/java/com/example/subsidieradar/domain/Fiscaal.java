package com.example.subsidieradar.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Fiscaal extends Subsidie implements Serializable {
    int maxSubsidiePercentage;
    public Fiscaal(String naam, String subsidieverstrekker, String subsidialeActiviteiten, Date maxLooptijd, double subsidieBudget, Date startDatum, Date deadline, String beoordelingssystematiek, String subsidieWebsiteLink, int matchPercentage, iMatch match) {
        super(naam, subsidieverstrekker, subsidialeActiviteiten, maxLooptijd, subsidieBudget, startDatum, deadline, beoordelingssystematiek, subsidieWebsiteLink);
    }

    public Fiscaal() {

    }
}
