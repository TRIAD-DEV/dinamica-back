package com.anotacoes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anotacoes.entity.AnotacaoEntity;
import com.anotacoes.model.AnotacaoVo;
import com.anotacoes.repository.AnotacaoRepository;

@Service
public class AnotacaoService {
	
	@Autowired
	private AnotacaoRepository _repository;
	
	public List<AnotacaoVo> listarAnotacoes() throws Exception {
		
		List<AnotacaoEntity> anotacoesEntity = _repository.findAll();
		List<AnotacaoVo> anotacoes = new ArrayList<AnotacaoVo>();
		
		for(AnotacaoEntity anotacao: anotacoesEntity) {
			anotacoes.add(new AnotacaoVo(anotacao));
		}
		
		
		
		return anotacoes;
	}

	public AnotacaoEntity create(AnotacaoEntity obj) {
		
		return _repository.save(obj);
	}

	public Optional<AnotacaoEntity> findById(Long id) {
		return _repository.findById(id);
	}

	public List<AnotacaoEntity> listAll() {
		return _repository.findAll();
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		_repository.deleteById(id);
	}
}
