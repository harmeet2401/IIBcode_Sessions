package com.in28minutes.rest.webservices.restfullservice.interceptor;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import java.io.IOException;

public class RestTemplateHeaderModifierInterceptor
        implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request,
                                        byte[] body,
                                        ClientHttpRequestExecution execution)
            throws IOException {
        System.out.println("interceptor----------------------[");
        ClientHttpResponse response = execution.execute(request, body);
        response.getHeaders().add("Foo", "bar");
        return response;
    }
}