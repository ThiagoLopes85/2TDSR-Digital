package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("contato")
public class ContatoController {

	//M�todo que abre a p�gina com o formul�rio
	@GetMapping("enviar")
	public String abrirForm() {
		return "contato/form";
	}
	
	//Metodo que processa as informa��es do formul�rio
	@PostMapping("enviar")
	public ModelAndView processarForm(String nome, String telefone, String email){
		System.out.println(nome + " " + telefone + " " + email);
		//Enviar valores para a tela:
		ModelAndView retorno = 
					new ModelAndView("contato/form"); //pasta + p�gina jsp
		//Adicionar os valores para a p�gina 
		retorno.addObject("msg","Contato enviado!");
		retorno.addObject("nome", nome);
		return retorno;
	}
	
}
