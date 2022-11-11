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

    public Fiscaal(String naam, String afkortingen, String niveau, String subsidieverstrekker, String doel, String themas, String subsidiabele_activiteiten, String locatie, String soort_organisatie, String samenwerking, String type_samenwerking, double totaal_budget, double subsidiebedrag_min, double subsidiebedrag_max, String bijzonderheid, String subsidiepercentage_min, String subsidiepercentage_max, String datum_open, String datum_sluit, String beoordeling_tender, double looptijdProject_jaren, int maxSubsidiePercentage) {
        super(naam, afkortingen, niveau, subsidieverstrekker, doel, themas, subsidiabele_activiteiten, locatie, soort_organisatie, samenwerking, type_samenwerking, totaal_budget, subsidiebedrag_min, subsidiebedrag_max, bijzonderheid, subsidiepercentage_min, subsidiepercentage_max, datum_open, datum_sluit, beoordeling_tender, looptijdProject_jaren);
        this.maxSubsidiePercentage = maxSubsidiePercentage;
    }

    public Fiscaal() {

    }
}
