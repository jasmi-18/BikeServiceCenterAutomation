package com.ey.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
   @Autowired
   private JwtFilter jwtFilter;
   @Bean
   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http
           .csrf(csrf -> csrf.disable())
           .authorizeHttpRequests(auth -> auth
               // PUBLIC APIs
               .requestMatchers(
                       "/api/auth/register",
                       "/api/auth/login",
                       "/api/auth/forgot-password",
                       "/api/auth/reset-password"
               ).permitAll()
               // ADMIN APIs
               .requestMatchers("/api/admin/**").hasRole("ADMIN")
               // USER APIs
               .requestMatchers(
                       "/api/bike/**",
                       "/api/service/**",
                       "/api/payment/**",
                       "/api/estimation/**",
                       "/api/notification/**",
                       "/api/reminder/**"
               ).hasRole("USER")
               .anyRequest().authenticated()
           )
           .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
       return http.build();
   }
}