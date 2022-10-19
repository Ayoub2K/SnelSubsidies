package com.example.subsidieradar.application;

import com.example.subsidieradar.data.SubsidieRadarRepository;
import com.example.subsidieradar.domain.Subsidie;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class SubsidieService {
    private final SubsidieRadarRepository subsidieRadarRepository;

    public SubsidieService(SubsidieRadarRepository subsidieRadarRepository) {
        this.subsidieRadarRepository = subsidieRadarRepository;
    }

    public List<Subsidie> getSubsidies() throws Exception {
        try{
            return this.subsidieRadarRepository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
