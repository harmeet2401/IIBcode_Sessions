package com.in28minutes.microservices.apigateway.configs;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ApiRouteConfiguration {

    /**
     * this function will help us to map a url for path parameter.
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes().
                route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("MYheadre","Header")
                                .addRequestParameter("FirstParm","myparam"))
                                .uri("http://httpbin.org:80"))
                .route(p -> p.path("/currency-exchange/**")
                .uri("lb://currency-exchange"))
                .route(p -> p.path("/currency-conversion/**")
                        .uri("lb://currency-conversion"))
                .route(p -> p.path("/currency-conversion-feign/**")
                        .uri("lb://currency-conversion"))
                .route(p -> p.path("/currency-conversion-new/**")
                        .filters(f ->f.rewritePath("/currency-conversion-new/(?<segment>.*)",
                                "/currency-conversion-feign/${segment}"))
                        .uri("lb://currency-conversion"))
                .build();
    }
}