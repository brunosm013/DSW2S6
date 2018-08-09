package br.edu.ifsp.arq.dw2.compras;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraHP implements Impressora{
	
	public void imprimir(String texto ) {
		System.out.println(">>>>> imprimindo na HP: " + texto);
	}

}
