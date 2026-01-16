package com.ey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.ey.dto.request.LoginRequest;
import com.ey.dto.request.RegisterRequest;
import com.ey.dto.response.LoginResponse;
import com.ey.dto.response.ProfileResponse;
import com.ey.entity.User;
import com.ey.mapper.UserMapper;
import com.ey.repository.UserRepository;
import com.ey.security.JwtUtil;

@Service
public class AuthService {
   @Autowired
   private UserRepository userRepository;
   // REGISTER
   public void register(RegisterRequest request) {
       User user = UserMapper.toEntity(request);
       userRepository.save(user);
   }
   // LOGIN → JWT GENERATED
   public LoginResponse login(LoginRequest request) {
       User user = userRepository.findByEmail(request.getEmail());
       if (user == null) {
           throw new RuntimeException("User not found");
       }
       if (!user.getPassword().equals(request.getPassword())) {
           throw new RuntimeException("Invalid credentials");
       }
       String token = JwtUtil.generateToken(
               user.getEmail(),
               user.getRole()
       );
       return new LoginResponse(token, user.getRole());
   }
   // PROFILE → READ USER FROM JWT
   public ProfileResponse profile() {
       String email = SecurityContextHolder
               .getContext()
               .getAuthentication()
               .getName();
       User user = userRepository.findByEmail(email);
       return new ProfileResponse(
               user.getUserId(),
               user.getName(),
               user.getEmail(),
               user.getRole()
       );
   }
}