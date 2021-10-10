package org.bzu.exp;

import org.bzu.exp.model.ExpModel;
import org.bzu.exp.repository.ExpRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.AllArgsConstructor;

@SpringBootApplication
//@EnableZipkinServer
@AllArgsConstructor
@EnableEurekaClient
public class ExperimentMicroserviceApplication implements CommandLineRunner{

	ExpRepository repo;
	
	MapperService mapper;
	
	public static void main(String[] args) {
		SpringApplication.run(ExperimentMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 100; i++) {
			
			repo.save(mapper.getNewModel("Test"+i));
		}
		
	}

}
