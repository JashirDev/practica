package com.example.demo.web;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeService service;

    @GetMapping(value= "/numbers", produces = { MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE })
    public Flux<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @PostMapping(value= "/numbers", produces = { MediaType.APPLICATION_STREAM_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE })
    public Mono<Employee>saveEmployee(@Validated @RequestBody Employee employee){
        return  service.postEmplpoyee(employee);
    }
}
