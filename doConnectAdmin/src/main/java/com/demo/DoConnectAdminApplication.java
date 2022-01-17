package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient	
public class DoConnectAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoConnectAdminApplication.class, args);
		System.out.println("Admin Service");
	}
	
	@Bean
	public RestTemplate initTemplete() {
		return new RestTemplate();
	}

}
