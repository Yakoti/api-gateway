//package com.ridetogether.api_gateway;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RouterFunctions.route;
//
//@Configuration
//public class ApiRouter {
//
//    @Bean
//    public RouterFunction<ServerResponse> router() {
//        return route(GET("/test"), request -> ServerResponse.ok().bodyValue("Hello WebFlux"));
//    }
//}
