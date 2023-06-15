package com.anotacoes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_usuario", nullable=false)
	private Long codigo;

	@Column(name = "nm_usuario")
	private String nome;

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}  
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
