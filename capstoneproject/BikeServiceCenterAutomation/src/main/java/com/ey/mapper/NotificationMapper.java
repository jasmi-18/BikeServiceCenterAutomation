package com.ey.mapper;

import com.ey.dto.request.NotificationRequest;
import com.ey.entity.Notification;

public class NotificationMapper {
	   public static Notification toEntity(NotificationRequest request) {
	       Notification notification = new Notification();
	       notification.setUserId(request.getUserId());
	       notification.setMessage(request.getMessage());
	       return notification;
	   }
	}