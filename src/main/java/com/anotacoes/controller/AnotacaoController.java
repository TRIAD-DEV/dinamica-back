package com.anotacoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anotacoes.entity.AnotacaoEntity;
import com.anotacoes.model.AnotacaoVo;
import com.anotacoes.repository.AnotacaoRepository;
import com.anotacoes.service.AnotacaoService;

import jakarta.websocket.server.PathParam;

@RequestMapping("/anotacoes")

@RestController
@CrossOrigin("*")
public class AnotacaoController {
	
	
	@DeleteMapping (value="/{id}")
	public void deleteTask(@PathVariable Long id) {
		anotacaoRepository.delete(id);
		
	}
	
	@Autowired
	private AnotacaoService _service;
	
	@Autowired
	private AnotacaoRepository anotacaoRepository;
	
	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity<Object> listarAnotacoes() throws Exception {
		try {
			List<AnotacaoVo> anotacoes = _service.listarAnotacoes();
			return ResponseEntity.ok(anotacoes);			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@PostMapping(value = "/criar")
	public ResponseEntity<AnotacaoEntity> criaAnotacao(@RequestBody AnotacaoEntity obj) {
		AnotacaoEntity newobj = _service.create(obj);
		return ResponseEntity.ok().body(newobj);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<AnotacaoEntity>> findById(@PathVariable Long id){
		Optional<AnotacaoEntity> obj = _service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
