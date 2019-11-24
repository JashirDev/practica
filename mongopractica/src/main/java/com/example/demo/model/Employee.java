package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
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
    @NotNull(message = "EL Id no puede ser nulo")
    @NotEmpty(message = "EL Id no puede ser vacio")
    private String id;

    private String name;

    @NotNull(message = "EL Id no puede ser nulo")
    @NotEmpty(message = "EL Id no puede ser vacio")
    private Double salary;

}
