package com.euflausino.desafio_backend_it.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transacao {
	
	private Double valor;
	private OffsetDateTime dataHora;
	
	public Transacao(Double valor, OffsetDateTime dataHora) {
		this.valor = valor;
		this.dataHora = dataHora;
	}
	
	public Transacao() {
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public OffsetDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	
	
	
}
