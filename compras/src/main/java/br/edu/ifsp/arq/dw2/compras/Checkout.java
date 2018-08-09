package br.edu.ifsp.arq.dw2.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {
	@Autowired
	@Qualifier("impressoraHP")
	private Impressora impressora;

	public void finalizar() {
		impressora.imprimir("Nota fiscal paulista");
	}
}
