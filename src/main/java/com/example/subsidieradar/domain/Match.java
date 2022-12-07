package com.example.subsidieradar.domain;

import com.example.subsidieradar.presentation.dto.InputDTO;

import java.util.ArrayList;
import java.util.List;

public class Match implements iMatch {
    @Override
    public List<Subsidie> findMatches(List<Subsidie> subsidies,
                                    String sector,
                                    String thema,
                                    String typeActiviteit,
                                    String budget,
                                    String startDatum,
                                    String eindDatum,
                                    String projectlocatie,
                                    boolean bijdrage,
                                    String samenwerking) {
        List<Subsidie> filteredSubsidies = new ArrayList<>();

        for (Subsidie subsidie : subsidies) {
            // eerst checken we groep 1; 65 punten; thema, activiteiten
            int percentageGroep1 = 65;
            if (!subsidie.getThemas().contains(thema)) {    // als subsidie ander thema heeft -10%
                percentageGroep1 = percentageGroep1 - 35;
            }
            if (!subsidie.getSubsidiabele_activiteiten().contains(typeActiviteit)) {
                percentageGroep1 = percentageGroep1 - 30;
            }

            // dan groep 2; 35 punten; Verplicht; Minimaal benodigd subsidiebedrag, beoogde startdatum
            // niet verplicht; Niet verplicht: beoogde einddatum, cofinanciering mogelijkheid
            int percentageGroep2 = 35;
            double min = Double.parseDouble(budget);
            if (min > subsidie.subsidiebedrag_min) {
                percentageGroep2 = percentageGroep2 - 15;
            }

            subsidie.setMatchingPercentage(percentageGroep1 + percentageGroep2);
            filteredSubsidies.add(subsidie);
        }

        return filteredSubsidies;
    }
}
