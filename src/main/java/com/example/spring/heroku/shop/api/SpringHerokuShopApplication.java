package com.example.spring.heroku.shop.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHerokuShopApplication {

	@GetMapping("/")
	public String sayHello(){
		return "Hello From Heroku Cloud Service!";
	}

	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input){
		return "Welcome! " + input;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuShopApplication.class, args);
	}

}
