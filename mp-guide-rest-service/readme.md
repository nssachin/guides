# MicroProfile generated Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

The generation of the executable jar file can be performed by issuing the following command

    mvn verify

This will create an executable jar file **rest-service.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/restservice.jar



To launch the test page, open your browser at the following URL

    http://localhost:8080/index.html

Now the service is up, visit `http://localhost:8080/api/greeting` where you should see:

    {"id":1,"content":"Hello, World!"}
Provide a name to the query param, `http://localhost:8080/api/greeting?name=SNS`, you should see now the content as:

    {"id":1,"content":"Hello, SNS"}

There are inbuilt support for Health & Metrics endpoints provided by Helidon.

###Health
    http://localhost:8080/health

###Metrics
    http://localhost:8080/metrics




## Specification examples

By default, there is always the creation of a JAX-RS application class to define the path on which the JAX-RS endpoints are available.

More information on MicroProfile can be found [here](https://microprofile.io/)


















