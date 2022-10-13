package com.example.subsidieradar.data;

import com.example.subsidieradar.domain.Subsidie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubsidieRadarRepository extends JpaRepository<Subsidie, Long> {
    Optional<Subsidie> findSubsidieById(long id);
}
