package br.edu.ifsp.arq.dw2.cervejeiro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstilosController {
	
	@RequestMapping("/estilos/novo")
	public String novo() {
		return "estilo/cadastro_estilo";
	}
}
