package com.example.subsidieradar.presentation.controller;

import com.example.subsidieradar.presentation.dto.SubsidieDTO;
import org.springframework.web.bind.annotation.*;

@RestController
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
