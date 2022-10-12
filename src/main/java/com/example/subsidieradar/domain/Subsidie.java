package com.example.subsidieradar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Subsidie implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    String naam;
    String subsidieverstrekker;
    String subsidialeActiviteiten;
    Date MaxLooptijd;
    double subsidieBudget;
    Date startDatum;
    Date deadline;
    String beoordelingssystematiek;
    String subsidieWebsiteLink;

    public Subsidie(String naam, String subsidieverstrekker, String subsidialeActiviteiten, Date maxLooptijd, double subsidieBudget, Date startDatum, Date deadline, String beoordelingssystematiek, String subsidieWebsiteLink) {
        this.naam = naam;
        this.subsidieverstrekker = subsidieverstrekker;
        this.subsidialeActiviteiten = subsidialeActiviteiten;
        this.MaxLooptijd = maxLooptijd;
        this.subsidieBudget = subsidieBudget;
        this.startDatum = startDatum;
        this.deadline = deadline;
        this.beoordelingssystematiek = beoordelingssystematiek;
        this.subsidieWebsiteLink = subsidieWebsiteLink;
    }

    public Subsidie() {

    }
}
