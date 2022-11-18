package com.example.subsidieradar.application;

import com.example.subsidieradar.data.SubsidieRepository;
import com.example.subsidieradar.domain.Subsidie;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class SubsidieService {
    private final SubsidieRepository subsidieRadarRepository;

    public SubsidieService(SubsidieRepository subsidieRadarRepository) {
        this.subsidieRadarRepository = subsidieRadarRepository;
    }

    public List<Subsidie> getSubsidies() throws Exception {
        try {
            return this.subsidieRadarRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Subsidie getSubsidie(String subsidie) throws Exception{
        try {
            return this.subsidieRadarRepository.findByNaam(subsidie);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<Subsidie> filterSubsidies(String budget) throws Exception{
        try {
            return this.subsidieRadarRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void fillWithTestdata() throws ParseException {
//        //TODO: SQL functie hier runnen
        List<Subsidie> subsidieList = new ArrayList<>();
        subsidieBuilder.build(subsidieList);

        this.subsidieRadarRepository.deleteAll();
        this.subsidieRadarRepository.saveAll(subsidieList);

        System.out.println("Filled dummy data");
    }

}
