package com.anotacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anotacoes.entity.AnotacaoEntity;

@Repository
public interface AnotacaoRepository extends JpaRepository<AnotacaoEntity, Long>{
	
}
