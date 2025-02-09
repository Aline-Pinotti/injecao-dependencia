package com.devsuperior.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.pedido.entities.Order;
import com.devsuperior.pedido.services.OrderService;

@SpringBootApplication
public class pedidoApplication implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(pedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.printf("Pedido código %d", order1.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order1));

		System.out.printf("Pedido código %d", order2.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));

		System.out.printf("Pedido código %d", order3.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));
	}

}
