package com.example.subsidieradar.application;

import com.example.subsidieradar.domain.Subsidie;

import java.util.List;

public class subsidieBuilder {
    public static void build(List<Subsidie> subsidieList) {

        Subsidie s1 = new Subsidie("a", "a", "a", "a", "a", "a","a", "a", "a", "a", "a", 1, 1, 1,
                "a", "a", "a", "a","a", "a", 1);

        Subsidie s2 = new Subsidie("b", "a", "a", "a", "a", "a","a", "a", "a", "a", "a", 1, 1, 1,
                "a", "a", "a", "a","a", "a", 1);

        subsidieList.add(s1);
        subsidieList.add(s2);
    }
}
