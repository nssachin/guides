package com.example.restclient;

import com.example.restclient.entity.Activity;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Dependent
@RegisterRestClient(configKey = "api.activity")
@Path("api/activity")
@Produces(MediaType.APPLICATION_JSON)
public interface ActivityServiceClient {

    @GET
    Activity getRandomActivity();
}
