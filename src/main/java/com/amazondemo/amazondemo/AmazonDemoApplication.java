package com.amazondemo.amazondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AmazonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/hello")
class Controller {
	
	@GetMapping()
	public String hello() {
		return "Hello There";
	}
}
