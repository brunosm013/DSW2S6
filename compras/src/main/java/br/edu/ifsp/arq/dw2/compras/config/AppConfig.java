package br.edu.ifsp.arq.dw2.compras.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.edu.ifsp.arq.dw2.compras.Checkout;
import br.edu.ifsp.arq.dw2.compras.Impressora;
import br.edu.ifsp.arq.dw2.compras.ImpressoraHP;

@Configuration
@ComponentScan("br.edu.ifsp.arq.dw2.compras")
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
