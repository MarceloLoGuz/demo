package com.example.demo.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.security.auth.AuthenticationRequest;
import com.example.demo.security.auth.AuthenticationResponse;
import com.example.demo.service.AuthenticationService;


@Component
@Path("/api/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
