package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.service.Services;

@SpringBootApplication
public class SpringDi1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(SpringDi1Application.class, args);
		
	Services services = context.getBean(Services.class);
	List<Product> list = services.findAll();
	System.out.println("[Product]");
	for(Product p : list) {
		System.out.println("product_id="+p.getProductId()+" ,product_name="+p.getProductName()+" ,price="+p.getPrice());
	}
	
	}

}
