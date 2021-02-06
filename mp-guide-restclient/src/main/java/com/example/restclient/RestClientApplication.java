package com.example.restclient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
@ApplicationScoped
public class RestClientApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(ComicsResource.class);
        classes.add(ExchangeRatesResource.class);
        classes.add(ActivityResource.class);

        return classes;
    }
}
