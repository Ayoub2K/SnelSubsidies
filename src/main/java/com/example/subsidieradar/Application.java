package com.example.subsidieradar;

import com.example.subsidieradar.application.SubsidieService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;

@Component
public class Application {

    private final SubsidieService subsidieService;

    public Application( SubsidieService subsidieService) {
        this.subsidieService = subsidieService;
    }

    @PostConstruct
    public void initialize() throws ParseException {
        subsidieService.fillWithTestdata();
    }
}