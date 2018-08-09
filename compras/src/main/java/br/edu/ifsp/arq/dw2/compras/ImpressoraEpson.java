package br.edu.ifsp.arq.dw2.compras;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraEpson implements Impressora{
	
	public void imprimir(String texto ) {
		System.out.println(">>>>> imprimindo na Epson: " + texto);
	}

}
