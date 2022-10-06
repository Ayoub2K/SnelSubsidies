package com.example.subsidieradar.domain;

public class SubsidieMatch {
    Subsidie subsidie;
    int matchPercentage;
    iMatch match;

    public SubsidieMatch(Subsidie subsidie, int matchPercentage, iMatch match) {
        this.subsidie = subsidie;
        this.matchPercentage = matchPercentage;
        this.match = match;
    }
}
