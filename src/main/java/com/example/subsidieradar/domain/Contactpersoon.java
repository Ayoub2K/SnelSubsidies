package com.example.subsidieradar.domain;

import com.example.subsidieradar.domain.exceptions.AlreadyExistsException;

import java.util.ArrayList;

public class Contactpersoon {
    String naam;
    String adres;
    String woonplaats;
    String functie;
    String email;
    int telnr;

    ArrayList<Organisatie> organisaties = new ArrayList<Organisatie>();

    public Contactpersoon(String naam, String adres, String woonplaats, String functie, String email, int telnr) {
        this.naam = naam;
        this.adres = adres;
        this.woonplaats = woonplaats;
        this.functie = functie;
        this.email = email;
        this.telnr = telnr;
    }

    public void voegOrganisatieToe(Organisatie organisatie) throws AlreadyExistsException {
        if(!organisaties.contains(organisatie)) {
            this.organisaties.add(organisatie);
        } else {
            throw new AlreadyExistsException();
        }
    }
}
