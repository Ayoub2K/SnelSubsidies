package com.example.subsidieradar.domain;

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
}
