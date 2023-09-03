package com.nzuri.nzuribackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NzuriBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NzuriBackendApplication.class, args);
	}

	@GetMapping
	public String sayHi(){
		return "Hi CICd";
	}

}
