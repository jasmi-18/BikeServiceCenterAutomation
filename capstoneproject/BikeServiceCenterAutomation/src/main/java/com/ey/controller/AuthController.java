package com.ey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.request.LoginRequest;
import com.ey.dto.request.RegisterRequest;
import com.ey.dto.response.CommonResponse;
import com.ey.dto.response.LoginResponse;
import com.ey.dto.response.ProfileResponse;
import com.ey.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
   @Autowired
   private AuthService authService;
   @PostMapping("/register")
   public CommonResponse register(@RequestBody RegisterRequest request) {
       authService.register(request);
       return new CommonResponse("Registration successful");
   }
   @PostMapping("/login")
   public LoginResponse login(@RequestBody LoginRequest request) {
       return authService.login(request);
   }
   @GetMapping("/profile")
   public ProfileResponse profile() {
       return authService.profile();
   }
}