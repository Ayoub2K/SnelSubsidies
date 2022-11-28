package com.example.subsidieradar.domain;

import java.util.List;

public interface iMatch {
    public List<Subsidie> findMatches(List<Subsidie> allSubsidies, boolean bijdragen);
}
