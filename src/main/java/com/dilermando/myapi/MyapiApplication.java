package com.dilermando.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dilermando.myapi.domain.Usuario;
import com.dilermando.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	@Autowired
	private UsuarioRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Dilermando Andrade", "Mateus Passos", "123");
		Usuario u2 = new Usuario(null, "Fernando Diogenis", "Romeu PLácido", "345");
		
		repository.saveAll(Arrays.asList(u1,u2));

	}

}
