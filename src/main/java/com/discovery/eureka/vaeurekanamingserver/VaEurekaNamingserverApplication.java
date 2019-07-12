package com.discovery.eureka.vaeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VaEurekaNamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaEurekaNamingserverApplication.class, args);
	}

}
