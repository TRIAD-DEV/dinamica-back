package com.anotacoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anotacoes.model.AnotacaoVo;
import com.anotacoes.service.AnotacaoService;

@RequestMapping("/anotacoes")

@RestController
public class AnotacaoController {
	
	@Autowired
	private AnotacaoService _service;
	
	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity<Object> getAnotacoes() throws Exception {
		try {
			List<AnotacaoVo> anotacoes = _service.listarAnotacoes();
			return ResponseEntity.ok(anotacoes);			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
