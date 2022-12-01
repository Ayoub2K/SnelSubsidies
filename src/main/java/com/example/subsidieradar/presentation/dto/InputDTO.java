package com.example.subsidieradar.presentation.dto;

public class InputDTO {
    String sector;
    String thema;
    String typeActiviteit;
    String budget;
    String startDatum;
    String eindDatum;
    String projectlocatie;
    boolean bijdrage;
    String samenwerking;

    public InputDTO(String sector, String thema, String typeActiviteit, String budget, String startDatum, String eindDatum, String projectlocatie, boolean bijdrage, String samenwerking) {
        this.sector = sector;
        this.thema = thema;
        this.typeActiviteit = typeActiviteit;
        this.budget = budget;
        this.startDatum = startDatum;
        this.eindDatum = eindDatum;
        this.projectlocatie = projectlocatie;
        this.bijdrage = bijdrage;
        this.samenwerking = samenwerking;
    }

    public String getSector() {
        return sector;
    }

    public String getThema() {
        return thema;
    }

    public String getTypeActiviteit() {
        return typeActiviteit;
    }

    public String getBudget() {
        return budget;
    }

    public String getStartDatum() {
        return startDatum;
    }

    public String getEindDatum() {
        return eindDatum;
    }

    public String getProjectlocatie() {
        return projectlocatie;
    }

    public boolean isBijdrage() {
        return bijdrage;
    }

    public String getSamenwerking() {
        return samenwerking;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public void setTypeActiviteit(String typeActiviteit) {
        this.typeActiviteit = typeActiviteit;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    public void setEindDatum(String eindDatum) {
        this.eindDatum = eindDatum;
    }

    public void setProjectlocatie(String projectlocatie) {
        this.projectlocatie = projectlocatie;
    }

    public void setBijdrage(boolean bijdrage) {
        this.bijdrage = bijdrage;
    }

    public void setSamenwerking(String samenwerking) {
        this.samenwerking = samenwerking;
    }
}
