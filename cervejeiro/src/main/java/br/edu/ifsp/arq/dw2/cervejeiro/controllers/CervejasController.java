package br.edu.ifsp.arq.dw2.cervejeiro.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifsp.arq.dw2.cervejeiro.model.Cerveja;

@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		return "cerveja/cadastro-cerveja";
	}
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST) 
	public String cadasto(@Valid Cerveja c, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			result.getAllErrors().forEach(item -> {
				System.out.println(item.getDefaultMessage());
			});
			model.addAttribute(c);
			return "cerveja/cadastro-cerveja";
		}	
		System.out.println(c);
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso");
		return "redirect:/cervejas/novo";
	}
	
	@RequestMapping("/cervejas/cadastro")
	public String cadastro() {
		return "cerveja/cadastro-produto";
	}
}
