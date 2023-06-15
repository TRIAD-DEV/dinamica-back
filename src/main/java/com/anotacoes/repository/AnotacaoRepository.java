package com.anotacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anotacoes.entity.AnotacaoEntity;

import jakarta.transaction.Transactional;

@Repository
public interface AnotacaoRepository extends JpaRepository<AnotacaoEntity, Long>{
	@Modifying 
	@Transactional
	@Query (value = "delete from tb_anotacao where id = ?1", nativeQuery = true)
	void delete(Long id);
}
