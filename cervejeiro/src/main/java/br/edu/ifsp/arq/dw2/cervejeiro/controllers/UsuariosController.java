package br.edu.ifsp.arq.dw2.cervejeiro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuariosController {
	
	@RequestMapping("/usuarios/novo")
	public String novo() {
		return "usuario/cadastro_usuario";
	}
}