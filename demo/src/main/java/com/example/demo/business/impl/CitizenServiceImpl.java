package com.example.demo.business.impl;

import com.example.demo.business.CitizenService;
import com.example.demo.model.Citizen;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class CitizenServiceImpl implements CitizenService {


    @Override
    public Mono<Citizen> getCitizen() {
        Citizen citizen = new Citizen();
        citizen.setName("Carlos");
        citizen.setLastName("Del Solar");
        citizen.setAge("28");
        return Mono.just(citizen);
    }
}
