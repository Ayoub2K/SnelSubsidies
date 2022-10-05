package com.example.subsidieradar.domain;

import java.util.Date;

public class Cofinanciering extends Subsidie{
    double maxSubsidiebedrag;
    public Cofinanciering(String naam, String subsidieverstrekker, String subsidialeActiviteiten, Date maxLooptijd, double subsidieBudget, Date startDatum, Date deadline, String beoordelingssystematiek, String subsidieWebsiteLink, int matchPercentage, iMatch match) {
        super(naam, subsidieverstrekker, subsidialeActiviteiten, maxLooptijd, subsidieBudget, startDatum, deadline, beoordelingssystematiek, subsidieWebsiteLink, matchPercentage, match);
    }
}
