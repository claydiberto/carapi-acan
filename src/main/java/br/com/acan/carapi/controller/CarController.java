package br.com.acan.carapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController {
	
	@GetMapping
	public String getStart() {
		return "Github and Heroku were tested";
	}

}
