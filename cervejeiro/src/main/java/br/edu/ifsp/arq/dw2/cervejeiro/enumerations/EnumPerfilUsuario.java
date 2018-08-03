package br.edu.ifsp.arq.dw2.cervejeiro.enumerations;

public enum EnumPerfilUsuario {
	ADM(1, "Administrador"), VENDEDOR(2, "Vendedor");
	
	int id;
	String nome;
	
	EnumPerfilUsuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
}
