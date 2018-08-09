package br.edu.ifsp.arq.dw2.compras;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public Impressora impressora() {
		return new ImpressoraHP();
	}

	@Bean
	public Checkout checkout(Impressora impressora) {
		return new Checkout(impressora);
	}
}
