package com.example.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.example.demo.controller.AuthenticationController;
import com.example.demo.controller.DocumentController;
import com.example.demo.controller.UserController;


@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CorsFilter.class);
        register(UserController.class);
        register(AuthenticationController.class);
        register(DocumentController.class);
    }
}
