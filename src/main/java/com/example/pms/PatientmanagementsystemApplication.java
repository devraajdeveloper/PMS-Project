package com.example.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.pms")
public class PatientmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientmanagementsystemApplication.class, args);
	}

}
