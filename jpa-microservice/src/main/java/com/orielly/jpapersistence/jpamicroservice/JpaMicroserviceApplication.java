package com.orielly.jpapersistence.jpamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaMicroserviceApplication.class, args);
	}

	{
		System.out.println("----testing the instance block ----");
	}
}
