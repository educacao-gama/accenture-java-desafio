package com.gama.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 20,nullable = false)
	private String cpf;
	
	@Column(length = 100,nullable = false)
	private String nome;
	
	@Column(length = 20 ,nullable = false)
	private String login;
	
	@Column(length = 100,nullable = false)
	private String senha;
	
	@Column(length = 100, name = "senha_temp")
	private String senhaTemporaria;
	
	public Integer getId() {
		return id;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenhaTemporaria() {
		return senhaTemporaria;
	}
	public void setSenhaTemporaria(String senhaTemporaria) {
		this.senhaTemporaria = senhaTemporaria;
	}
	
	public boolean isRedefinirSenha() {
		return getSenhaTemporaria()!=null;
	}
}
