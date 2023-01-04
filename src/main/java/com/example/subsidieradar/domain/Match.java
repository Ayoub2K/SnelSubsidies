package com.example.subsidieradar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Match implements iMatch {
    @Override
    public List<Subsidie> findMatches(List<Subsidie> subsidies,
                                    String sector,
                                    String thema,
                                    String typeActiviteit,
                                    String budget,
                                    String typeAanvrager,
                                    String projectlocatie,
                                    boolean bijdrage,
                                    String samenwerking) {
        List<Subsidie> filteredSubsidies = new ArrayList<>();

        for (Subsidie subsidie : subsidies) {
            //eerst checken we of er knockoutcriteria zijn
            subsidie.setKnockout(false);

            if (!subsidie.getNiveau().toLowerCase().contains(projectlocatie.substring(1, projectlocatie.length() -1).toLowerCase())){
                subsidie.setKnockout(true);
            }

            if (!subsidie.getSoort_organisatie().toLowerCase().contains(typeAanvrager.substring(1, typeAanvrager.length() -1).toLowerCase())){
                subsidie.setKnockout(true);
            }

            if (!subsidie.getSector().equals("Geen vereiste")){
                if (!subsidie.getSector().toLowerCase().contains(sector.substring(1, sector.length() -1).toLowerCase())){
                    subsidie.setKnockout(true);
                }
            }


            // dan checken we groep 1; 65 punten; thema, activiteiten
            int percentageGroep1 = 65;
            if (!subsidie.getThemas().toLowerCase().contains(thema.toLowerCase())) {    // als subsidie ander thema heeft -35%
                percentageGroep1 = percentageGroep1 - 35;
            }
            if (!subsidie.getSubsidiabele_activiteiten().toLowerCase().contains(typeActiviteit.toLowerCase())) {
                percentageGroep1 = percentageGroep1 - 30;
            }

            // dan groep 2; 35 punten; Verplicht; Minimaal benodigd subsidiebedrag, beoogde startdatum
            // niet verplicht;, cofinanciering mogelijkheid
            int percentageGroep2 = 35;
            double min = Double.parseDouble(budget.substring( 1, budget.length() - 1 ));
            if (min > subsidie.subsidiebedrag) {
                percentageGroep2 = percentageGroep2 - 15;
            }



            subsidie.setMatchingPercentage(percentageGroep1 + percentageGroep2);
            filteredSubsidies.add(subsidie);
        }

        return filteredSubsidies;
    }
}
