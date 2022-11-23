package com.grupo6.petshop.dto;

import java.io.Serializable;

import com.grupo6.petshop.domain.Servico;

public class ServicoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String  descricao;		
	private String cliente;
	private String funcionario;
	private String pet;
	
	public ServicoDTO() {
		
	}

	public ServicoDTO(Servico obj) {		
		this.id = obj.getId();
		this.descricao = obj.getDescricao();
		this.cliente = obj.getCliente().getNome();
		this.funcionario = obj.getFuncionario().getNome();
		this.pet = obj.getPet().getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}


}
