package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.dto.request.NotificationRequest;
import com.ey.entity.Notification;
import com.ey.mapper.NotificationMapper;
import com.ey.repository.NotificationRepository;

@Service
public class NotificationService {
   @Autowired
   private NotificationRepository repository;
   public void send(NotificationRequest request) {
       Notification notification = NotificationMapper.toEntity(request);
       repository.save(notification);
   }
   public List<Notification> myNotifications(Long userId) {
       return repository.findByUserId(userId);
   }
}
