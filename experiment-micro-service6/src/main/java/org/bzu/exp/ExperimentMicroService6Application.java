package org.bzu.exp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ExperimentMicroService6Application {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentMicroService6Application.class, args);
	}

}
