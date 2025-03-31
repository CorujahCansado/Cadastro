package com.aula01.CadastroDeNinjas.controllers;

import com.aula01.CadastroDeNinjas.missoes.Missoes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "missao_id")
    private Missoes Missao;

	
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
	
	public long getId () {
		return id;
	}

	public Missoes getMissao() {
		return Missao;
	}

	public void setMissao(Missoes missao) {
		Missao = missao;
	}
	
	
}
