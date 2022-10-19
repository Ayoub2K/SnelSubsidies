package com.example.subsidieradar.application;

import com.example.subsidieradar.data.SubsidieRepository;
import com.example.subsidieradar.domain.Subsidie;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public void fillWithTestdata() throws ParseException {

        String sDate1="31/12/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        String sDate2="31/12/1998";
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);

        String sDate3="31/12/1998";
        Date date3 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);

        Subsidie s1 = new Subsidie("subsidieNaam", "subsidievestrekker", "subsidialeActiviteiten",
                date1, 12, date2, date3, "beoordelingssystematiek", "websitelink");

        this.subsidieRadarRepository.save(s1);
    }
}
