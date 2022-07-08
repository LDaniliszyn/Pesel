package com.example.pesel1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pesel1Application {

	public static void main(String[] args) {
		PeselValidator peselValidator = new PeselValidator();
		System.out.println(peselValidator.validTest("02520656282"));
		SpringApplication.run(Pesel1Application.class, args);

	}

}
