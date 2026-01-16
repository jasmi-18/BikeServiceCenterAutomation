package com.ey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.response.CommonResponse;
import com.ey.service.ReminderService;

@RestController
@RequestMapping("/api/reminder")
public class ReminderController {
   @Autowired
   private ReminderService service;
   @PostMapping("/enable")
   public CommonResponse enable(
           @RequestParam Long serviceRequestId,
           @RequestParam String notificationType) {
       service.enable(serviceRequestId, notificationType);
       return new CommonResponse("Reminder enabled");
   }
   @PostMapping("/disable/{serviceRequestId}")
   public CommonResponse disable(@PathVariable Long serviceRequestId) {
       service.disable(serviceRequestId);
       return new CommonResponse("Reminder disabled");
   }
}
