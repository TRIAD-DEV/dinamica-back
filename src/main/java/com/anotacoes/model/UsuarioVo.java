package com.anotacoes.model;

import com.anotacoes.entity.UsuarioEntity;

public class UsuarioVo {
	
	private Long codigo;
	private String nome;

	public UsuarioVo(UsuarioEntity usuarioEntity) {
		this.codigo = usuarioEntity.getCodigo();
		this.nome = usuarioEntity.getNome();
	}

	public Long getCodigo() {
		return codigo;
	} 

	public String getNome() {
		return nome;
	}  	
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
