package com.in28mins.Myapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableConfigServer //--- this will come only when we use the spring cloud starter dependencies
@SpringBootApplication
public class MyapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

}
