package com.example.demo.web;

import com.example.demo.business.CitizenService;
import com.example.demo.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CitizenController {
    @Autowired
    CitizenService service;

    @GetMapping("/citizen")
    Mono<Citizen>getCitizen(){
        return  service.getCitizen();
    }
    
    @GetMapping(value= "/numbers", produces = { MediaType.APPLICATION_STREAM_JSON_VALUE,
    	      MediaType.APPLICATION_JSON_VALUE })
    Flux<Integer> getNumbers(){
    	return service.getNumber();
    }
}
