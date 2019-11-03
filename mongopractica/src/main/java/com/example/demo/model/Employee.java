package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Employee")
public class Employee implements Serializable {

    @Id
    @NotNull
    private String id;

    private String name;

    private Double salary;

}
