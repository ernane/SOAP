require 'savon'

class ListaFilme
  attr_reader :filmes

  def initialize
    client = Savon.client(wsdl: "http://localhost:8080/filmes?wsdl")
    response = client.call(:listar_filmes)

    if response.success?
      @filmes = response.to_array(:listar_filmes_response, :return)
    end
  end

  def lista_filmes
    @filmes.map do |filme|
      puts "Titulo: #{filme[:titulo]} - #{filme[:ano_lancamento]}"
    end
  end
end

l = ListaFilme.new
l.lista_filmes