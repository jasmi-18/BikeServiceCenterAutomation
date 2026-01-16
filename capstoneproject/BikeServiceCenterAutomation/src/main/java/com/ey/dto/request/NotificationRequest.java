package com.ey.dto.request;

public class NotificationRequest {
	 private Long userId;
	   private String message;
	   public NotificationRequest() {
		super();
		// TODO Auto-generated constructor stub
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
