package br.edu.ifsp.arq.dw2.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Checkout {
	@Autowired
	private Impressora impressora;

	public void finalizar() {
		impressora.imprimir("Nota fiscal paulista");
	}
}
