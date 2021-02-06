package com.example.restclient;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

@ApplicationScoped
@Path("/activity")
@Produces(MediaType.APPLICATION_JSON)
public class ActivityResource {

    private static final String CONFIG_URL = "/mp-rest/url";

    @Inject
    Config config;

    @GET
    public Response getRandomActivity() throws MalformedURLException {
        ActivityServiceClient activityServiceClient = RestClientBuilder.newBuilder()
                                                                        .baseUrl(getBaseUrl())
                                                                        .build(ActivityServiceClient.class);
        return Response.ok(activityServiceClient.getRandomActivity()).build();
    }

    private URL getBaseUrl() throws MalformedURLException {
        Optional<String> value = config.getOptionalValue("api.activity" + CONFIG_URL, String.class);
        if (value.isPresent()) {
            return new URL(value.get());
        }
        return null;
    }
}
