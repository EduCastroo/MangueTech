package com.manguetech.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "postagem")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String titulo;

	@NotNull
	private String texto;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataPostagem = LocalDate.now();

	private String midia;

	private long curtida;

	private long compartilhamento;

	@ManyToOne
	@JsonIgnoreProperties("minhasPostagens")
	@JoinColumn(name = "fk_tema")
	private Tema temaRelacionado;

	@ManyToOne
	@JsonIgnoreProperties("minhasPostagens")
	@JoinColumn(name = "fk_usuario")
	private Usuario sponsor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(LocalDate dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public long getCurtida() {
		return curtida;
	}

	public void setCurtida(long curtida) {
		this.curtida = curtida;
	}

	public long getCompartilhamento() {
		return compartilhamento;
	}

	public void setCompartilhamento(long compartilhamento) {
		this.compartilhamento = compartilhamento;
	}

	public Tema getTemaRelacionado() {
		return temaRelacionado;
	}

	public void setTemaRelacionado(Tema temaRelacionado) {
		this.temaRelacionado = temaRelacionado;
	}

	public Usuario getSponsor() {
		return sponsor;
	}

	public void setSponsor(Usuario sponsor) {
		this.sponsor = sponsor;
	}

}
