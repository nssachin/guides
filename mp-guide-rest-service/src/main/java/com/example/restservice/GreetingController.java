package com.example.restservice;

import javax.inject.Singleton;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Greeting Controller
 */
@Singleton
@Path("/")
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    @GET
    @Path("greeting")
    public Greeting greeting(@DefaultValue("World") @QueryParam(value = "name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GET
    @Path("hello")
    public String hello() {
        return "Hello Helidon!";
    }
}
