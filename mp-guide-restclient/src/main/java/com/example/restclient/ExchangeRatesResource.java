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
@Path("/exchange-rates")
@Produces(MediaType.APPLICATION_JSON)
public class ExchangeRatesResource {

    @Inject
    @RestClient
    private ExchangeRatesServiceClient ratesServiceClient;

    @GET
    public Response getExchangeRates() {
        return Response.ok(ratesServiceClient.getExchangeRates()).build();
    }
}
