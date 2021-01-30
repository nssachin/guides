package com.example.restclient;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/comics")
@Produces(MediaType.APPLICATION_JSON)
public class ComicsController {

    @Inject
    @RestClient
    private ComicsService comicsService;

    @GET
    public Response getComics() {
        return Response.ok(comicsService.getComics()).build();
    }

}
