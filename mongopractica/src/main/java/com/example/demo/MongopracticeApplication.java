package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongopracticeApplication {
//ejecuta mongod.exe antes de iniciar el cliente
	public static void main(String[] args) {
		SpringApplication.run(MongopracticeApplication.class, args);
	}

}
