package com.reign.lofty.goteiapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class GoteiapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoteiapiApplication.class, args);
		System.out.println("Registro Gotei 13 com WebFlux!");
	}
}