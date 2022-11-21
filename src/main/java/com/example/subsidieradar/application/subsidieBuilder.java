package com.example.subsidieradar.application;

import com.example.subsidieradar.domain.Subsidie;

import java.util.List;

public class subsidieBuilder {
    public static void build(List<Subsidie> subsidieList) {

        Subsidie s1 = new Subsidie(
                "Regeling natuurlijk sneller bouwen",
                "RNSB",
                "Provinciaal",
                "Provincie Gelderland",
                "Met de Regeling natuurlijk sneller bouwen stimuleert de provincie Gelderland bedrijven om hun productieproces te veranderen naar prefab bouw voor nieuwbouwwoningen.",
                "Circulair bouwen; prefab bouwen;industrieel bouwen;",
                "Subsidie kan worden aangevraagd voor het omzetten van het productieproces naar prefab bouw of verbetering van het bestaande productieproces voor prefab bouw op of ten behoeve van een productielocatie in Gelderland gericht op de versnelling van de bouw van nieuwbouwwoningen.",
                "Gelderland",
                "MKB",
                "Nee",
                "Nee",
                1800000, 200000, 200000,
                "Datum is doorlopend",
                "0", "50",
                "9/5/2022",null,
                "Tender",
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
                "0", "0",
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
                "0", "0",
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
                "0", "0",
                "a","a",
                "a",
                1);



        subsidieList.add(s1);
        subsidieList.add(s2);
        subsidieList.add(s3);
        subsidieList.add(s4);
    }
}
