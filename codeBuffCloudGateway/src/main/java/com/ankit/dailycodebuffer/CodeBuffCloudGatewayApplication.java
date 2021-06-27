package com.ankit.dailycodebuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class CodeBuffCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeBuffCloudGatewayApplication.class, args);
	}

}
