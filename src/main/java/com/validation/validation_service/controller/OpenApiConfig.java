package com.validation.validation_service.controller;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        servers = @Server(url = "https://validation-service-production-1151.up.railway.app")
)
public class OpenApiConfig {
}