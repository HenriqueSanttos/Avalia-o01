package com.avaliacao1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CotacaoMilho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	private String dia;

	public String getdia() {
		return dia;
	}

	public void setNome(String dia) {
		this.dia = dia;
	}
	
	public String getvalor() {
		return valor;
	}

	public void setvalor(String valor) {
		this.valor = valor;
	}


	private String valor;
	
	
}
