package com.example.demo.service;

import com.example.demo.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeService {
    Flux<Employee> getAllEmployees();
    Mono<Employee> postEmplpoyee(Employee employee);
    Mono<Employee>getSingleEmloyee(String id);

}
