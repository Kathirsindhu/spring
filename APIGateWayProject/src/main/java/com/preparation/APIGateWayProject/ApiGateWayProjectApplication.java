package com.preparation.APIGateWayProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ApiGateWayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayProjectApplication.class, args);
	}

}
