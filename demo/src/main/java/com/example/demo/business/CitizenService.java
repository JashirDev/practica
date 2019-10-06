package com.example.demo.business;

import com.example.demo.model.Citizen;
import reactor.core.publisher.Mono;

public interface CitizenService {


    Mono<Citizen> getCitizen();
}
