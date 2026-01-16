package com.ey.dto.request;

public class DeliveryRequest {
	   private Long serviceRequestId;
	   private String deliveryAddress;
	   public DeliveryRequest() {
		super();
		// TODO Auto-generated constructor stub
	   }
	   public Long getServiceRequestId() {
		   return serviceRequestId;
	   }
	   public void setServiceRequestId(Long serviceRequestId) {
		   this.serviceRequestId = serviceRequestId;
	   }
	   public String getDeliveryAddress() {
		   return deliveryAddress;
	   }
	   public void setDeliveryAddress(String deliveryAddress) {
		   this.deliveryAddress = deliveryAddress;
	   }
	   
}
	   
