package br.com.lucianokogut;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class AppInServer extends ResourceConfig {
    public AppInServer() {
        packages("br.com.lucianokogut.controller");
    }
    
}
