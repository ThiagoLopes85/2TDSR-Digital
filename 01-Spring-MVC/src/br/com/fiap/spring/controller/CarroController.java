package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.spring.model.Carro;

@Controller
@RequestMapping("carro")
public class CarroController {

	@GetMapping("cadastrar")
	public String abrirForm() {
		return "carro/form";
	}
	
	@PostMapping("cadastrar")
	public String processarForm(Carro c) {
		System.out.println(c.getPlaca() + " " + c.getPreco() + " " 
				+ c.isAutomatico() + " " + c.getMarca());
		return "carro/form";
	}
}
