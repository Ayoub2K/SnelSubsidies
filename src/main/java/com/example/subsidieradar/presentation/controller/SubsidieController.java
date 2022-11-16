package com.example.subsidieradar.presentation.controller;

import com.example.subsidieradar.application.SubsidieService;
import com.example.subsidieradar.domain.Subsidie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/subsidie")
public class SubsidieController {
    private final SubsidieService subsidieService;

    public SubsidieController(SubsidieService subsidieService) {
        this.subsidieService = subsidieService;
    }

    @GetMapping
    public List<Subsidie> getSubsidies() throws Exception {
        return subsidieService.getSubsidies();
    }

    @PostMapping
    public List<Subsidie> filterSubsidies(@RequestParam String budget) throws Exception {
        System.out.println("controller post");
        System.out.println(budget);
        return subsidieService.filterSubsidies(budget);
    }
}
