package com.example.demo.web;

import com.example.demo.business.CitizenService;
import com.example.demo.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CitizenController {
    @Autowired
    CitizenService service;

    @GetMapping("/citizen")
    Mono<Citizen>getCitizen(){
        return  service.getCitizen();
    }
}
