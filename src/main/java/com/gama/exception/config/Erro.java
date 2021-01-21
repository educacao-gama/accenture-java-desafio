package com.gama.exception.config;

public enum Erro {
	LOGIN_EXISTENTE_001("001","Já existe um usuario cadastrado com o login %s"),
	SEM_PERMISSAO_002("002","Usuário sem permissão, path: %s")
	
	;
	
	private String codigo;
	private String mensagem;
	
	private Erro(String codigo, String mensagem) {
		this.codigo=codigo;
		this.mensagem=mensagem;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
	
}
