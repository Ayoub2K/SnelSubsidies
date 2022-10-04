package com.example.subsidieradar.domain;

import java.util.ArrayList;

public class Contactpersoon {
    String naam;
    String adres;
    String woonpplaats;
    String functie;
    String email;
    Long telnr;

    ArrayList<Organisatie> organisaties = new ArrayList<Organisatie>();
}
