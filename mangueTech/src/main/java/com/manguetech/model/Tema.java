package com.manguetech.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tema")
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

	@OneToMany(mappedBy = "temaRelacionado", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("temaRelacionado")
	private List<Postagem> postagens = new ArrayList<>();

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

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

}
