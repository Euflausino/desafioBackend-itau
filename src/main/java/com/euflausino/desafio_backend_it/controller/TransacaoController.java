package com.euflausino.desafio_backend_it.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.euflausino.desafio_backend_it.dto.TransacaoRequestDTO;
import com.euflausino.desafio_backend_it.service.TransacaoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
	
	private TransacaoService transacaoService;

	public TransacaoController(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}
	
	@PostMapping
	public BodyBuilder criarTransacao(@RequestBody @Valid TransacaoRequestDTO criarTransacao){
		transacaoService.criarTransacao(criarTransacao);
		return ResponseEntity.created(null);
	}
	
}
