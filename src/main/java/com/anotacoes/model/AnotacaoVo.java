package com.anotacoes.model;

import com.anotacoes.entity.AnotacaoEntity;

public class AnotacaoVo {
	
	private Long codigo;
	private String titulo;

	public AnotacaoVo(AnotacaoEntity anotacaoEntity) {
		this.codigo = anotacaoEntity.getCodigo();
		this.titulo = anotacaoEntity.getTitulo();
		
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
