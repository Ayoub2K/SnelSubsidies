package com.example.subsidieradar.domain;

import java.util.ArrayList;
import java.util.List;

public class Match implements iMatch{
    @Override
    public List<Subsidie> findMatches(List<Subsidie> allSubsidies, boolean bijdragen) {
        List<Subsidie> filteredSubsidies = new ArrayList<>();

        for (Subsidie subsidie:allSubsidies) {
            if(false != bijdragen){ //false zou subsidie.getbijdragen moeten zijn
                //wijzig hier de matching percentage ? idk of we dit moeten doen in de subsidie.java
                System.out.printf("idk");
            }
            filteredSubsidies.add(subsidie);
        }

        return filteredSubsidies;
    }
}
