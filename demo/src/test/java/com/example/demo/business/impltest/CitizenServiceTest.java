package com.example.demo.business.impltest;

import com.example.demo.business.CitizenService;
import com.example.demo.business.impl.CitizenServiceImpl;
import com.example.demo.model.Citizen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.springframework.http.MediaType;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(SpringJUnit4ClassRunner.class)
//@Profile("local")
@WebFluxTest
public class CitizenServiceTest {
    @Spy
    CitizenServiceImpl serviceImpl;

    @MockBean
    CitizenService service;
    
    @Autowired
    WebTestClient cliebnt;

//    @Test
//    public void probasService(){
////        Citizen citizen = new Citizen();
////        citizen.setName("Carlos");
////        citizen.setLastName("Del Solar");
////        citizen.setAge("28");
////        given(serviceImpl.getCitizen()).willReturn(Mono.just(citizen));
//        Mono<Citizen> actual= serviceImpl.getCitizen();
//
////        StepVerifier.create(actual)
////                .assertNext(expex -> Assert.assertEquals(expex.getName(),"Carlos"))
////
////                .verifyComplete()
////                .ver
//
//
//        StepVerifier.create(actual).consumeNextWith(r -> {
//            assertEquals("Carlos", r.getName());
//        }).verifyComplete();
//        
//
//
//    }
    
    
//    @Test
//    public void testeo2() {
//    	
//    	Mono<Citizen>citi = (Mono<Citizen>) cliebnt.get().uri("/citizen")
//        .accept(MediaType.APPLICATION_JSON_UTF8)
//        .exchange()
//        .expectStatus().isOk()
//        .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
//        .expectBodyList(Citizen.class)
//        .hasSize(1);
//    }
    
    @Test
    public void testeo3() {
    	
    	Flux<Integer> intergerFlux = cliebnt.get().uri("/numbers")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .returnResult(Integer.class)
                .getResponseBody();
    	
    	StepVerifier.create(intergerFlux)
        .expectSubscription()
        .expectNext(1)
        .expectNext(2)
        .expectNext(3)
        .expectNext(4)
        .expectComplete()
        ;
    	
    	
    	Flux<Citizen>citi  = cliebnt.get().uri("/citizen")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .returnResult(Citizen.class)
                .getResponseBody();
    	
    	
   	StepVerifier.create(citi)
       .expectSubscription()
       .expectNextCount(1)
        .expectComplete()
        ;
    }


}
