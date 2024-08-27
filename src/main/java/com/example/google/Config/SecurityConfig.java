package com.example.google.Config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/").permitAll(); // Autorise l'accès à la page d'accueil
                    auth.anyRequest().authenticated(); // Les autres requêtes doivent être authentifiées
                })
                .oauth2Login(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults()) // Fournit un formulaire de connexion par défaut
                .build();
    }
}
