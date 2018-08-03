package br.edu.ifsp.arq.dw2.cervejeiro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/novo")
	public String novo() {
		return "cliente/cadastro_cliente";
	}
}
