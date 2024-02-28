package com.studyabroadplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyAbroadPlatformApplication {

	@GetMapping("/test")
	public String getMessage() {
		return "microservice is healthy";
	}
	public static void main(String[] args) {
		SpringApplication.run(StudyAbroadPlatformApplication.class, args);
	}

}
