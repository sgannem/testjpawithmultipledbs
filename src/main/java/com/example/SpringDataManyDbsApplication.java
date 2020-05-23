package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringDataManyDbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataManyDbsApplication.class, args);
	}
	
	/*@Autowired
	private UsersRepository userRepository;*/
	
	/*@Autowired
	private ProductRepository productRepository;*/
	
	/*@PostConstruct
	void init () {
		
		*//*Users chickCorea = new Users("Mohnis", "Narayana");
		userRepository.save(chickCorea);*//*
		Product p1 = new Product();
		p1.setName("Samsungs9new");
		p1.setPrice(500);

		//Product cleanCode = new Product("Samsungs9new", 5000);
		productRepository.save(p1);
		
		
	}*/
	
}
