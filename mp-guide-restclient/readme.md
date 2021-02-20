# MicroProfile Rest Client

### Introduction

A type-safe approach to invoke RESTful services over HTTP and based on JAX-RS. MP Rest client can be either created in
one of the below options:
- programmatically using `RestClientBuilder`
- decoratively using annotation and CDI support

### Configurations
Below are the properties provided via Microprofile Config

- CONFIG_URL = "/mp-rest/url"
- CONFIG_URI = "/mp-rest/uri"
- CONFIG_SCOPE = "/mp-rest/scope"
- CONFIG_CONNECTION_TIMEOUT = "/mp-rest/connectTimeout"
- CONFIG_READ_TIMEOUT = "/mp-rest/readTimeout"
- CONFIG_SSL_TRUST_STORE_LOCATION = "/mp-rest/trustStore"
- CONFIG_SSL_TRUST_STORE_TYPE = "/mp-rest/trustStoreType"
- CONFIG_SSL_TRUST_STORE_PASSWORD = "/mp-rest/trustStorePassword"
- CONFIG_SSL_KEY_STORE_LOCATION = "/mp-rest/keyStore"
- CONFIG_SSL_KEY_STORE_TYPE = "/mp-rest/keyStoreType"
- CONFIG_SSL_KEY_STORE_PASSWORD = "/mp-rest/keyStorePassword"
- CONFIG_SSL_HOSTNAME_VERIFIER = "/mp-rest/hostnameVerifier"
- CONFIG_PROVIDERS = "/mp-rest/providers"
- CONFIG_PROVIDER_PRIORITY = "/priority"

### Examples
Below sample example shows the various ways of creating mp rest client:
- [ComicsServiceClient](src/main/java/com/example/restclient/ComicsServiceClient.java) & [ComicsResource](src/main/java/com/example/restclient/ComicsResource.java): Rest client using annotation and CDI
- [ExchangeRatesServiceClient](src/main/java/com/example/restclient/ExchangeRatesServiceClient.java) & [ExchangeRatesResource](src/main/java/com/example/restclient/ExchangeRatesResource.java): Rest client with properties set via microprofile config and CDI
- [ActivityServiceClient](src/main/java/com/example/restclient/ActivityServiceClient.java) & [ActivityResource](src/main/java/com/example/restclient/ActivityResource.java): Programmatic way of creating rest client using `RestClientBuilder` instead of CDI

The sample project uses Helidon Microprofile runtime (Version - `MP 3.3`). MP 3.3 version uses microprofile rest client 
`1.4` release

### Spec
[MicroProfile Rest Client 1.4](https://download.eclipse.org/microprofile/microprofile-rest-client-1.4.0/microprofile-rest-client-1.4.0.pdf)















