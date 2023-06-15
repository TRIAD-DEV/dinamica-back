package com.anotacoes.service;

import java.util.ArrayList;
import java.util.List;

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
}
