package br.edu.ifsp.arq.dw2.compras;

public class Checkout {
	private ImpressoraHP impressora;

	public Checkout() {
		this.impressora = new ImpressoraHP();
	}

	public void finalizar() {
		impressora.imprimir("Nota fiscal paulista");
	}
}
