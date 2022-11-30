package com.example.subsidieradar.presentation.dto;

public class InputDTO {
    String sector;
    String thema;
    String typeActiviteit;
    int budget;
    String startDatum;
    String eindDatum;
    String projectlocatie;
    boolean bijdrage;
    String samenwerking;

    public String getSector() {
        return sector;
    }

    public String getThema() {
        return thema;
    }

    public String getTypeActiviteit() {
        return typeActiviteit;
    }

    public int getBudget() {
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

    public void setBudget(int budget) {
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
