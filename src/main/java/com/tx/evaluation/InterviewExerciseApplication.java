package com.tx.evaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class InterviewExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewExerciseApplication.class, args);
	}

}
