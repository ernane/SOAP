package com.playmovie.locadora.modelos;

public class Filme {

	private String titulo;
	private String categoria;
	private String diretor;
	private Integer anoLancamento;

	public Filme(){}
	
	public Filme(String titulo, String categoria, String diretor, Integer anoLancamento){
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
}
