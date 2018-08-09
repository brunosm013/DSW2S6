package br.edu.ifsp.arq.dw2.compras;

public class Checkout {
	private Impressora impressora;

	public Checkout(Impressora impressora) {
		this.impressora = impressora;
	}

	public void finalizar() {
		impressora.imprimir("Nota fiscal paulista");
	}
}
