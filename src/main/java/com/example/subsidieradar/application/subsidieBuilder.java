package com.example.subsidieradar.application;

import com.example.subsidieradar.domain.Subsidie;

import java.util.List;

public class subsidieBuilder {
    public static void build(List<Subsidie> subsidieList) {

        Subsidie s1 = new Subsidie("Regeling natuurlijk sneller bouwen",
                "RNSB",
                "Provinciaal",
                "Provincie Gelderland",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                1, 1, 1,
                "a",
                "a", "a",
                "a","a",
                "a",
                1);

        Subsidie s2 = new Subsidie("Demonstratie Energie- en Klimaatinnovatie",
                "DEI+",
                "Nationaal",
                "RVO",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                1, 1, 1,
                "a",
                "a", "a",
                "a","a",
                "a",
                1);

        Subsidie s3 = new Subsidie("Circulaire Ketenprojecten",
                "CKP",
                "Nationaal",
                "RVO",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                1, 1, 1,
                "a",
                "a", "a",
                "a","a",
                "a",
                1);

        Subsidie s4 = new Subsidie("Kennis en Innovatie agenda - Circulaire Economie",
                "KIA CE",
                "Nationaal",
                "RVO",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                1, 1, 1,
                "a",
                "a", "a",
                "a","a",
                "a",
                1);



        subsidieList.add(s1);
        subsidieList.add(s2);
        subsidieList.add(s3);
        subsidieList.add(s4);
    }
}
