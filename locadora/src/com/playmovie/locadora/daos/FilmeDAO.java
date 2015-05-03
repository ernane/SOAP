package com.playmovie.locadora.daos;

import java.util.ArrayList;
import java.util.List;

import com.playmovie.locadora.modelos.Filme;

public class FilmeDAO {
	public List<Filme> listaFilmes(){
		List<Filme> filmes = new ArrayList<Filme>();
		
		filmes.add(new Filme("Interstellar", "Adventure", "Christopher Nolan", 2014));
		filmes.add(new Filme("The Imitation Game", "Biography", "Morten Tyldum", 2014));
		filmes.add(new Filme("12 Years a Slave", "Biography", "Steve McQueen", 2013));
		filmes.add(new Filme("The Theory of Everything", "Biography", "James Marsh", 2014));
		filmes.add(new Filme("Guardians of the Galaxy", "Action", "James Gunn", 2014));
		filmes.add(new Filme("The Sixth Sense", "Drama", "M. Night Shyamalan", 1999));
		filmes.add(new Filme("The Hobbit: The Desolation of Smaug", "Adventure", "Peter Jackson", 2013));
		filmes.add(new Filme("Catch Me If You Can", "Biography", "Steven Spielberg", 2002));
		filmes.add(new Filme("Stand by Me", "Adventure", "Rob Reiner", 1986));
		
		return filmes;
	}
}
