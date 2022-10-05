package com.example.subsidieradar.domain;


import com.example.subsidieradar.domain.enums.Activiteit;
import com.example.subsidieradar.domain.enums.OrganisatieType;
import com.example.subsidieradar.domain.enums.Samenwerking;

import java.util.Date;

public class Project {
    OrganisatieType organisatieType;
    String sector;
    String thema;
    String projectlocatie;
    int minSubsidieBedrag;
    int minSubsidiePercentage;
    Date startdatum;
    Activiteit activiteit;
    Samenwerking samenwerking;

    public Project(OrganisatieType organisatieType, String sector, String thema,
                   String projectlocatie, int minSubsidieBedrag, int minSubsidiePercentage,
                   Date startdatum, Activiteit activiteit, Samenwerking samenwerking) {
        this.organisatieType = organisatieType;
        this.sector = sector;
        this.thema = thema;
        this.projectlocatie = projectlocatie;
        this.minSubsidieBedrag = minSubsidieBedrag;
        this.minSubsidiePercentage = minSubsidiePercentage;
        this.startdatum = startdatum;
        this.activiteit = activiteit;
        this.samenwerking = samenwerking;
    }
}
