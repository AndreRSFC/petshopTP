package com.grupo6.petshop.dto;

import java.io.Serializable;

import com.grupo6.petshop.domain.Categoria;

public class CategoriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer id;
	
	public CategoriaDTO() {
		
	}

	public CategoriaDTO(Categoria obj) {		
		this.nome = obj.getNome();
		this.id = obj.getId();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.id = id;
	}
}
