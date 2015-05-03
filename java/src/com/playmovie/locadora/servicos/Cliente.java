package com.playmovie.locadora.servicos;

import java.util.List;

public class Cliente {

	public static void main(String[] args){
		ListagemFilmesService listagemFilmesFactory = new ListagemFilmesService();
		
		ListagemFilmes listagemFilmes = listagemFilmesFactory.getListagemFilmesPort();
		
		List<Filme> filmes = listagemFilmes.listarFilmes();
		
		for (Filme filme : filmes) {
			System.out.println("Titulo: " + filme.getTitulo() + " - " + filme.getAnoLancamento());
		}
	}
}
