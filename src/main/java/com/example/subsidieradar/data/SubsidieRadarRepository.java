package com.example.subsidieradar.data;

import com.example.subsidieradar.domain.Subsidie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubsidieRadarRepository extends JpaRepository<Subsidie, Long> {
    Subsidie findSubsidieById(long id);
}
