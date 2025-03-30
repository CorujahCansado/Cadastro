package com.aula01.CadastroDeNinjas.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity transforma uma classe em uma entidade do Banco De Dados
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String email;
	private int idade;
	private int rank;
	
	public NinjaModel () {
		
	}
	
	public NinjaModel(String nome, String email, int idade, int rank) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.rank = rank;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
