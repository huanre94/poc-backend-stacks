package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class SaludoController {

	@GetMapping("/hola")
	public String Saludar() {
		return "Hola Mundo!";
	}
	
	@GetMapping("/hola/{nombre}")
	public String Saludar(@PathVariable String nombre) {
		return "Hola " + nombre + "!";
	}
	
	@PostMapping("/chao")
	public String Despedir(@RequestBody String nombre) {
		return "Hola Adios!" + nombre;
	}
	
}
