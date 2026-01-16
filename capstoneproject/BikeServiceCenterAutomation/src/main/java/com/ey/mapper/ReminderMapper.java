package com.ey.mapper;

import com.ey.entity.Reminder;

public class ReminderMapper {
	   public static Reminder toEntity(Long serviceRequestId, String notificationType) {
	       Reminder reminder = new Reminder();
	       reminder.setServiceRequestId(serviceRequestId);
	       reminder.setNotificationType(notificationType);
	       return reminder;
	   }
	}