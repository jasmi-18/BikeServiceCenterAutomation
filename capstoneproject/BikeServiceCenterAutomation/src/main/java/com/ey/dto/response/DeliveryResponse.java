package com.ey.dto.response;

public class DeliveryResponse {
	
	private String deliveryType;
	   private String status;
	   public DeliveryResponse() {
		super();
		// TODO Auto-generated constructor stub
	   }
	   public DeliveryResponse(String deliveryType, String status) {
		super();
		this.deliveryType = deliveryType;
		this.status = status;
	   }
	   public String getDeliveryType() {
		   return deliveryType;
	   }
	   public void setDeliveryType(String deliveryType) {
		   this.deliveryType = deliveryType;
	   }
	   public String getStatus() {
		   return status;
	   }
	   public void setStatus(String status) {
		   this.status = status;
	   }
	   
	   

}
