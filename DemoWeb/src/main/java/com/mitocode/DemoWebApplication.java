package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;


@SpringBootApplication
public class DemoWebApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);
	private static IPersonaService PersonaService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
		LOG.info("Hola mundo desde Spring boot en consola");
		PersonaService.registrar("MitoCode");
		}

}
