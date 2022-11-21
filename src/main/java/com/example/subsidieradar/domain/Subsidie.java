package com.example.subsidieradar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Subsidie implements Serializable {

//    @Id
//    @GeneratedValue
//    private Long id;

    @Id
    public String naam;
    String afkortingen;
    String niveau;
    String subsidieverstrekker;
    String doel;
    String themas;
    @Column(length = 999)
    String subsidiabele_activiteiten;
    String locatie;
    String soort_organisatie;
    String samenwerking;
    String type_samenwerking;
    double totaal_budget;
    double subsidiebedrag_min;
    double subsidiebedrag_max;
    String bijzonderheid;
    String subsidiepercentage_min;
    String subsidiepercentage_max;
    String datum_open;
    String datum_sluit;
    String beoordeling_tender;
    double looptijdProject_jaren;

    public Subsidie(String naam, String afkortingen, String niveau, String subsidieverstrekker, String doel, String themas, String subsidiabele_activiteiten, String locatie, String soort_organisatie, String samenwerking, String type_samenwerking, double totaal_budget, double subsidiebedrag_min, double subsidiebedrag_max, String bijzonderheid, String subsidiepercentage_min, String subsidiepercentage_max, String datum_open, String datum_sluit, String beoordeling_tender, double looptijdProject_jaren) {
        this.naam = naam;
        this.afkortingen = afkortingen;
        this.niveau = niveau;
        this.subsidieverstrekker = subsidieverstrekker;
        this.doel = doel;
        this.themas = themas;
        this.subsidiabele_activiteiten = subsidiabele_activiteiten;
        this.locatie = locatie;
        this.soort_organisatie = soort_organisatie;
        this.samenwerking = samenwerking;
        this.type_samenwerking = type_samenwerking;
        this.totaal_budget = totaal_budget;
        this.subsidiebedrag_min = subsidiebedrag_min;
        this.subsidiebedrag_max = subsidiebedrag_max;
        this.bijzonderheid = bijzonderheid;
        this.subsidiepercentage_min = subsidiepercentage_min;
        this.subsidiepercentage_max = subsidiepercentage_max;
        this.datum_open = datum_open;
        this.datum_sluit = datum_sluit;
        this.beoordeling_tender = beoordeling_tender;
        this.looptijdProject_jaren = looptijdProject_jaren;
    }

    public Subsidie() {

    }

//    public Long getId() {
//        return id;
//    }

    public String getNaam() {
        return naam;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getAfkortingen() {
        return afkortingen;
    }

    public String getSubsidieverstrekker() {
        return subsidieverstrekker;
    }

    public String getDoel() {
        return doel;
    }

    public String getThemas() {
        return themas;
    }

    public String getSubsidiabele_activiteiten() {
        return subsidiabele_activiteiten;
    }

    public String getLocatie() {
        return locatie;
    }

    public String getSoort_organisatie() {
        return soort_organisatie;
    }

    public String getSamenwerking() {
        return samenwerking;
    }

    public String getType_samenwerking() {
        return type_samenwerking;
    }

    public double getTotaal_budget() {
        return totaal_budget;
    }

    public double getSubsidiebedrag_min() {
        return subsidiebedrag_min;
    }

    public double getSubsidiebedrag_max() {
        return subsidiebedrag_max;
    }

    public String getBijzonderheid() {
        return bijzonderheid;
    }

    public String getSubsidiepercentage_min() {
        return subsidiepercentage_min;
    }

    public String getSubsidiepercentage_max() {
        return subsidiepercentage_max;
    }

    public String getDatum_open() {
        return datum_open;
    }

    public String getDatum_sluit() {
        return datum_sluit;
    }

    public String getBeoordeling_tender() {
        return beoordeling_tender;
    }

    public double getLooptijdProject_jaren() {
        return looptijdProject_jaren;
    }
}
