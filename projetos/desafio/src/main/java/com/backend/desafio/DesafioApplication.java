package com.backend.desafio;

import com.backend.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.backend.desafio.services.OrderService;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.backend"})
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Code: ");
		Integer code = sc.nextInt();
		System.out.print("Basic value: ");
		Double basic = sc.nextDouble();
		System.out.print("Discount: ");
		Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println();
		System.out.printf("Code:  %d%n", order.getCode());
		System.out.printf("Amount to pay: R$ %.2f%n", orderService.total(order));

	}
}
