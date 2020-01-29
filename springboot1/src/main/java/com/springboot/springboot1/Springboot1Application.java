package com.springboot.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1Application implements CommandLineRunner {

	//inyeccion de dependencia
	@Autowired
	Servicio miServicio;
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(miServicio.mensaje());
		
	}

}