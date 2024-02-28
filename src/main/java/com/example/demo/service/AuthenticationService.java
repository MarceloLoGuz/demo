package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.auth.AuthenticationRequest;
import com.example.demo.security.auth.AuthenticationResponse;
import com.example.demo.security.config.JwtService;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
        private final UserRepository repository;
        private final JwtService jwtService;
        private final AuthenticationManager authenticationManager;

        public AuthenticationResponse authenticate(AuthenticationRequest request) {

                UserModel user = repository.findOneByUsername(request.getUsername())
                                .orElse(null);

                authenticationManager.authenticate(
                                new UsernamePasswordAuthenticationToken(
                                                user.getUsername(),
                                                request.getPassword()));

                return AuthenticationResponse.builder()
                                .token(jwtService.generateToken(user))
                                .build();

        }
}