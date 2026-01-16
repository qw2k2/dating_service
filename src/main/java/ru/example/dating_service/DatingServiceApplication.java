package ru.example.dating_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point of Dating Service application.
 */
@SpringBootApplication
public class DatingServiceApplication {

	/**
	 * Application start method.
	 *
	 * @param args application arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(DatingServiceApplication.class, args);
	}
}
