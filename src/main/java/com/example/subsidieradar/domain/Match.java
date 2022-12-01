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
            // set subsidiePercentage op basis van if/switch statements
            subsidie.setMatchingPercentage(20);
            filteredSubsidies.add(subsidie);
        }

        return filteredSubsidies;
    }
}
