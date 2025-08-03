package com.elz.SecApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SecApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecApplication.class, args);
	}

}
