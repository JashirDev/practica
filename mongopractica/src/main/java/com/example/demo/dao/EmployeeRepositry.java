package com.example.demo.dao;

import com.example.demo.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepositry  extends ReactiveMongoRepository <Employee,String>{
}
