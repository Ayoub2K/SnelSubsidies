package com.example.subsidieradar.presentation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/subsidie")
public class SubsidieController {

    @GetMapping
    public String Hello() {
        return "hello world";
    }
}
