package com.playmovie.locadora.servicos;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.playmovie.locadora.modelos.Filme;
import com.playmovie.locadora.daos.FilmeDAO;

@WebService
public class ListagemFilmes {

	public List<Filme> listarFilmes(){
		FilmeDAO filmeDAO = getDAO();
		return filmeDAO.listaFilmes();
	}
	
	private FilmeDAO getDAO() {
		return new FilmeDAO();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/filmes", new ListagemFilmes());
		System.out.println("Serviço de Listagem de Filmes");
	}
}
