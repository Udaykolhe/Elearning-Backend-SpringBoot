package com.pgdac.elearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.pgdac.elearning.Entity.User;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ElearningPlatformApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(ElearningPlatformApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setfName("Uday");
		user.setlName("Kolhe");
		user.setContact("9512365445");
		user.setQualification("CDAC");
		user.setRole("ADMIN");
		user.setPassword("Pgdac@123");
		
	}

}
