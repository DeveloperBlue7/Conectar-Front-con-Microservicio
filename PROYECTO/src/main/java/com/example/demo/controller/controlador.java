package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador {
	
	@GetMapping ("/nombre")
	public String nombreProyecto() {
		return "Mi proyecto";
	}
	
	@GetMapping ("/descripcion")
	public String descripcionProyecto() {
		return "Mi proyecto en clase Spring Boot";
	}

}
