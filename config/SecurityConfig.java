package com.bestfit.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Yeni API'ye uygun CSRF devre dışı bırakma
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Tüm isteklere izin ver
            );

        return http.build();
    }
}
