package com.developer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.developer.model.Tourist")
@SpringBootApplication
public class TicketManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketManagementAppApplication.class, args);
	}

}
