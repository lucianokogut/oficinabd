package br.com.lucianokogut.controller;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

@Path("hello")
public class HelloRest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMensagem(@QueryParam("usuario") String usuario) {
        return "Bem-vindo " + usuario;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("usuarios/{id}")
    public String getUsuario(@PathParam("id") int id) {
        return "Recuperando usuário com ID: " + id;
    }
    
}
