package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeRepositry;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeService {
    @Autowired
    private EmployeeRepositry repo;

    @Override
    public Flux<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Mono<Employee> postEmplpoyee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Mono<Employee> getSingleEmloyee(String id) {
        return repo.findById(id);
    }
}
