package com.manguetech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private long quantidadePostagens;
	
	@NotNull
	private boolean tendenciaSemana;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQuantidadePostagens() {
		return quantidadePostagens;
	}

	public void setQuantidadePostagens(long quantidadePostagens) {
		this.quantidadePostagens = quantidadePostagens;
	}

	public boolean isTendenciaSemana() {
		return tendenciaSemana;
	}

	public void setTendenciaSemana(boolean tendenciaSemana) {
		this.tendenciaSemana = tendenciaSemana;
	}
	
}
