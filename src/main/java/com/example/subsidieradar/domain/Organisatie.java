package com.example.subsidieradar.domain;

import com.example.subsidieradar.domain.enums.OrganisatieType;
import com.example.subsidieradar.domain.exceptions.AlreadyExistsException;

import java.util.ArrayList;

public class Organisatie {
    String naam;
    String rechtsvorm;
    String adres;
    String vestigingsplaats;
    String website;
    int kvkNummer;
    OrganisatieType organisatieType;

    ArrayList<Project> projecten = new ArrayList<>();

    public Organisatie(String naam, String rechtsvorm, String adres, String vestigingsplaats, String website, int kvkNummer, OrganisatieType organisatieType) {
        this.naam = naam;
        this.rechtsvorm = rechtsvorm;
        this.adres = adres;
        this.vestigingsplaats = vestigingsplaats;
        this.website = website;
        this.kvkNummer = kvkNummer;
        this.organisatieType = organisatieType;
    }

    public void voegProjectToe(Project project) throws AlreadyExistsException {
        if(!projecten.contains(project)) {
            this.projecten.add(project);
        } else {
            throw new AlreadyExistsException();
        }
    }
}
