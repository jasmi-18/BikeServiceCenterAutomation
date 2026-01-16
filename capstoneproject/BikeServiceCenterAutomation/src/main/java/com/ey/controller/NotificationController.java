package com.ey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.request.NotificationRequest;
import com.ey.dto.response.CommonResponse;
import com.ey.entity.Notification;
import com.ey.service.NotificationService;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
   @Autowired
   private NotificationService service;
   @PostMapping("/send")
   public CommonResponse send(@RequestBody NotificationRequest request) {
       service.send(request);
       return new CommonResponse("Notification sent");
   }
   @GetMapping("/my-notifications")
   public List<Notification> myNotifications(@RequestParam Long userId) {
       return service.myNotifications(userId);
   }
}