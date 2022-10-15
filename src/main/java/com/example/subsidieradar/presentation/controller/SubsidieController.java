package com.example.subsidieradar.presentation.controller;

import com.example.subsidieradar.presentation.dto.SubsidieDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/subsidie")
public class SubsidieController {

    @GetMapping
    public SubsidieDTO Hello() {
        return new SubsidieDTO("hello world");
    }

//    @GetMapping
//    public MatchDTO searchMatches() {
//        return service.getMatches();
//    }
}
