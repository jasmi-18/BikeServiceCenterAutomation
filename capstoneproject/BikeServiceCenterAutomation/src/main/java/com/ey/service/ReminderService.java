package com.ey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Reminder;
import com.ey.mapper.ReminderMapper;
import com.ey.repository.ReminderRepository;

@Service
public class ReminderService {
   @Autowired
   private ReminderRepository repository;
   public void enable(Long serviceRequestId, String notificationType) {
       Reminder reminder =
               ReminderMapper.toEntity(serviceRequestId, notificationType);
       repository.save(reminder);
   }
   public void disable(Long serviceRequestId) {
       Reminder reminder =
               repository.findByServiceRequestId(serviceRequestId);
       repository.delete(reminder);
   }
}