package br.edu.ifsp.arq.dw2.cervejeiro.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message = "SKU é obrigatório")
	private String sku;
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	@NotBlank(message = "Descrição é obrigatória")
	@Size(min = 3, max = 50, message="O tamanho da descrição deve estar entre {min} e {max}")
	private String descricao;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Cerveja [sku=" + sku + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

}
