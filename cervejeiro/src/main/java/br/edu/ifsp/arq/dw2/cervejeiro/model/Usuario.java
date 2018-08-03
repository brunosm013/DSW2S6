package br.edu.ifsp.arq.dw2.cervejeiro.model;

import java.time.LocalDate;

import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;

import br.edu.ifsp.arq.dw2.cervejeiro.enumerations.EnumPerfilUsuario;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private LocalDate dataNascimento;
	private boolean status;
	private EnumPerfilUsuario perfil;
	
	public Usuario() {}

	public Usuario(String nome, String email, String senha, LocalDate dataNascimento, boolean status,
			EnumPerfilUsuario perfil) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.status = status;
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public EnumPerfilUsuario getPerfil() {
		return perfil;
	}

	public void setPerfil(EnumPerfilUsuario perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", dataNascimento=" + dataNascimento
				+ ", status=" + status + ", perfil=" + perfil + "]";
	}

}
