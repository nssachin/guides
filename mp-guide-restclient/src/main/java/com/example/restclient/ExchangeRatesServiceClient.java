package com.example.restclient;

import com.example.restclient.entity.ExchangeRates;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Dependent
@RegisterRestClient
@Path("api/latest")
@Produces(MediaType.APPLICATION_JSON)
public interface ExchangeRatesServiceClient {

    @GET
    ExchangeRates getExchangeRates();
}
