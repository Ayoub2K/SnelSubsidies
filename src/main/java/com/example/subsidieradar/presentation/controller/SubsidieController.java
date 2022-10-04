package com.example.subsidieradar.presentation.controller;

import com.example.subsidieradar.presentation.dto.subsidieDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subsidie")
public class SubsidieController {

    @GetMapping
    public subsidieDTO Hello() {
        return new subsidieDTO("hello world");
    }
}
