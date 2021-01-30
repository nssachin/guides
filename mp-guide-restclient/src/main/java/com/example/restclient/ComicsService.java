package com.example.restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Dependent
@RegisterRestClient(baseUri = "https://xkcd.com/")
@Path("info.0.json")
@Produces(MediaType.APPLICATION_JSON)
public interface ComicsService {

    @GET
    Comics getComics();
}
