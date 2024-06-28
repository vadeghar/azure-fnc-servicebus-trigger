package com.fabrikam;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class FunctionApplication implements CommandLineRunner {

	@Autowired
	BuildProperties buildProperties;

	public static void main(String[] args) {
		SpringApplication.run(FunctionApplication.class, args);
	}

	@Bean
	public String componentVersion() {
		return buildProperties.getGroup() +" : "+
				buildProperties.getArtifact() +" : "+
				buildProperties.getName() +" : "+
				buildProperties.getVersion() +" : "+
				buildProperties.getTime();
	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.findAndRegisterModules();
		return objectMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Application version {}", componentVersion());
	}
}
