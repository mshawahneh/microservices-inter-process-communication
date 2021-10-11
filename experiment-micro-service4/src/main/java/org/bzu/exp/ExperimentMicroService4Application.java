package org.bzu.exp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ExperimentMicroService4Application {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentMicroService4Application.class, args);
	}

}
