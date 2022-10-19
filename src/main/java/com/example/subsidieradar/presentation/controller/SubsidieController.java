package com.example.subsidieradar.presentation.controller;

import com.example.subsidieradar.application.SubsidieService;
import com.example.subsidieradar.presentation.dto.SubsidieDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/subsidie")
public class SubsidieController {
    private final SubsidieService subsidieService;

    public SubsidieController(SubsidieService subsidieService) {
        this.subsidieService = subsidieService;
    }

    @GetMapping
    public SubsidieDTO getSubsidies() throws Exception {
        return (SubsidieDTO) subsidieService.getSubsidies();
    }

//    @GetMapping
//    public MatchDTO searchMatches() {
//        return service.getMatches();
//    }
}
