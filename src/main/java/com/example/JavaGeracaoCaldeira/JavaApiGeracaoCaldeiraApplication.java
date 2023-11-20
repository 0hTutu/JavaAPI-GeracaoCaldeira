package com.example.JavaGeracaoCaldeira;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaApiGeracaoCaldeiraApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaApiGeracaoCaldeiraApplication.class, args);
	}
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "nome", defaultValue = "World") String nome) {
		return String.format("Hello %s!", nome);
	}
}
