package com.playsation.PlaystationSales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PlaystationSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaystationSalesApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Helton Soares!") String name) {
		return String.format("Inclusão do repository e criação da classe entity/Customer! developed by @%s!", name);
	}

}
