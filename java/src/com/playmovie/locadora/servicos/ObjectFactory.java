
package com.playmovie.locadora.servicos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.playmovie.locadora.servicos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarFilmesResponse_QNAME = new QName("http://servicos.locadora.playmovie.com/", "listarFilmesResponse");
    private final static QName _ListarFilmes_QNAME = new QName("http://servicos.locadora.playmovie.com/", "listarFilmes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.playmovie.locadora.servicos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarFilmesResponse }
     * 
     */
    public ListarFilmesResponse createListarFilmesResponse() {
        return new ListarFilmesResponse();
    }

    /**
     * Create an instance of {@link ListarFilmes }
     * 
     */
    public ListarFilmes createListarFilmes() {
        return new ListarFilmes();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFilmesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.locadora.playmovie.com/", name = "listarFilmesResponse")
    public JAXBElement<ListarFilmesResponse> createListarFilmesResponse(ListarFilmesResponse value) {
        return new JAXBElement<ListarFilmesResponse>(_ListarFilmesResponse_QNAME, ListarFilmesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFilmes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.locadora.playmovie.com/", name = "listarFilmes")
    public JAXBElement<ListarFilmes> createListarFilmes(ListarFilmes value) {
        return new JAXBElement<ListarFilmes>(_ListarFilmes_QNAME, ListarFilmes.class, null, value);
    }

}
