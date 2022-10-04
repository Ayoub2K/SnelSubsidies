package com.example.subsidieradar.domain;

import com.example.subsidieradar.domain.Enums.Activiteit;
import com.example.subsidieradar.domain.Enums.OrganisatieType;
import com.example.subsidieradar.domain.Enums.Samenwerking;

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
}
