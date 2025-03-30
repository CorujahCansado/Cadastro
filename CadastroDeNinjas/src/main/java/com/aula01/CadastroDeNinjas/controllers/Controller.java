package com.aula01.CadastroDeNinjas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	@GetMapping("/boasVindas")
	public String boasVindas () {
		return "Essa é Minha Primeira Mensagem Nessa Rota";
	}
}
