package com.ey.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notification {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long notificationId;
   private Long userId;
   private String message;
   public Notification() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Long getNotificationId() {
	return notificationId;
   }
   public void setNotificationId(Long notificationId) {
	this.notificationId = notificationId;
   }
   public Long getUserId() {
	return userId;
   }
   public void setUserId(Long userId) {
	this.userId = userId;
   }
   public String getMessage() {
	return message;
   }
   public void setMessage(String message) {
	this.message = message;
   }
   
}