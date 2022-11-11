package com.example.subsidieradar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cofinanciering extends Subsidie implements Serializable {
    double maxSubsidiebedrag;

    public Cofinanciering(String naam, String afkortingen, String subsidieverstrekker, String doel, String themas, String subsidiabele_activiteiten, String locatie, String soort_organisatie, String samenwerking, String type_samenwerking, double totaal_budget, double subsidiebedrag_min, double subsidiebedrag_max, String bijzonderheid, String subsidiepercentage_min, String subsidiepercentage_max, String datum_open, String datum_sluit, String beoordeling_tender, double looptijdProject_jaren, double maxSubsidiebedrag) {
        super(naam, afkortingen, subsidieverstrekker, doel, themas, subsidiabele_activiteiten, locatie, soort_organisatie, samenwerking, type_samenwerking, totaal_budget, subsidiebedrag_min, subsidiebedrag_max, bijzonderheid, subsidiepercentage_min, subsidiepercentage_max, datum_open, datum_sluit, beoordeling_tender, looptijdProject_jaren);
        this.maxSubsidiebedrag = maxSubsidiebedrag;
    }

    public Cofinanciering() {

    }
}
