package com.devsuperior.pedido;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  
public class pedidoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(pedidoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}

}
