package com.anotacoes.model;

import java.time.LocalDateTime;

import com.anotacoes.entity.AnotacaoEntity;
import com.anotacoes.entity.UsuarioEntity;

public class AnotacaoVo {
	
	private Long codigo;
	private String titulo;
	private String descricao;
	private LocalDateTime criacao;
	private LocalDateTime dataAtualizacao;
	private UsuarioVo usuarioEntity;


	public AnotacaoVo(AnotacaoEntity anotacaoEntity) {
		this.codigo = anotacaoEntity.getCodigo();
		this.titulo = anotacaoEntity.getTitulo();
		this.descricao = anotacaoEntity.getDescricao();
		this.criacao = anotacaoEntity.getCriacao();
		this.dataAtualizacao = anotacaoEntity.getDataAtualizacao();
		this.usuarioEntity = new UsuarioVo(anotacaoEntity.getUsuarioEntity());
		
	}
	
	
	
	public UsuarioVo getUsuarioEntity() {
		return usuarioEntity;
	}



	public void setUsuarioEntity(UsuarioVo usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}



	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDateTime getCriacao() {
		return criacao;
	}


	public void setCriacao(LocalDateTime criacao) {
		this.criacao = criacao;
	}


	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
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
