package com.meet.ioc.Di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add("Str-"+Integer.toString(i));
		}


		SpringApplication.run(DiApplication.class, args);
	}

}
