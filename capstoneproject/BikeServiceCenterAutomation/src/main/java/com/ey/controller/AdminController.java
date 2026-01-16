package com.ey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.repository.UserRepository;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
   @Autowired
   private UserRepository userRepository;
   @GetMapping("/users")
   public Object getAllUsers() {
       return userRepository.findAll();
   }
}