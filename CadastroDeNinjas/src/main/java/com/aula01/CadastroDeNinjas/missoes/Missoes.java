package com.aula01.CadastroDeNinjas.missoes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Missoes {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descricao;
	private int levelMissao;
	private String localMissao;
	private String recompensaMissao;
	private boolean statusMissao;
	private String dataMissaoAceita;
	private String dataMissaoFinalizada;
	private String dataMissaoFracassada;
	private int quantidadeDaMissaoFracassada;
	private String categoriaMissao;
	
	public Missoes(String nome, String descricao, int levelMissao, String localMissao, String recompensaMissao,
			boolean statusMissao, String dataMissaoAceita, String dataMissaoFinalizada, String dataMissaoFracassada,
			int quantidadeDaMissaoFracassada, String categoriaMissao) {
		this.nome = nome;
		this.descricao = descricao;
		this.levelMissao = levelMissao;
		this.localMissao = localMissao;
		this.recompensaMissao = recompensaMissao;
		this.statusMissao = statusMissao;
		this.dataMissaoAceita = dataMissaoAceita;
		this.dataMissaoFinalizada = dataMissaoFinalizada;
		this.dataMissaoFracassada = dataMissaoFracassada;
		this.quantidadeDaMissaoFracassada = quantidadeDaMissaoFracassada;
		this.categoriaMissao = categoriaMissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getLevelMissao() {
		return levelMissao;
	}

	public void setLevelMissao(int levelMissao) {
		this.levelMissao = levelMissao;
	}

	public String getLocalMissao() {
		return localMissao;
	}

	public void setLocalMissao(String localMissao) {
		this.localMissao = localMissao;
	}

	public String getRecompensaMissao() {
		return recompensaMissao;
	}

	public void setRecompensaMissao(String recompensaMissao) {
		this.recompensaMissao = recompensaMissao;
	}

	public boolean isStatusMissao() {
		return statusMissao;
	}

	public void setStatusMissao(boolean statusMissao) {
		this.statusMissao = statusMissao;
	}

	public String getDataMissaoAceita() {
		return dataMissaoAceita;
	}

	public void setDataMissaoAceita(String dataMissaoAceita) {
		this.dataMissaoAceita = dataMissaoAceita;
	}

	public String getDataMissaoFinalizada() {
		return dataMissaoFinalizada;
	}

	public void setDataMissaoFinalizada(String dataMissaoFinalizada) {
		this.dataMissaoFinalizada = dataMissaoFinalizada;
	}

	public String getDataMissaoFracassada() {
		return dataMissaoFracassada;
	}

	public void setDataMissaoFracassada(String dataMissaoFracassada) {
		this.dataMissaoFracassada = dataMissaoFracassada;
	}

	public int getQuantidadeDaMissaoFracassada() {
		return quantidadeDaMissaoFracassada;
	}

	public void setQuantidadeDaMissaoFracassada(int quantidadeDaMissaoFracassada) {
		this.quantidadeDaMissaoFracassada = quantidadeDaMissaoFracassada;
	}

	public String getCategoriaMissao() {
		return categoriaMissao;
	}

	public void setCategoriaMissao(String categoriaMissao) {
		this.categoriaMissao = categoriaMissao;
	}
	
	

}
