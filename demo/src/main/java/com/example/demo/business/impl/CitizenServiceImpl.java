package com.example.demo.business.impl;

import com.example.demo.business.CitizenService;
import com.example.demo.model.Citizen;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
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

	@Override
	public Flux<Integer> getNumber() {
		// TODO Auto-generated method stub
//		return Flux.just(1,2,3,4).delayElements(Duration.ofSeconds(1));
		
		return Flux.just(1,2,3,4).zipWith(Flux.interval(Duration.ofSeconds(2)),
				(tran, interval) -> tran);
	}
}
