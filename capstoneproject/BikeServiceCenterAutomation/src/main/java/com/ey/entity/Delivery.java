package com.ey.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long deliveryId;
   private Long serviceRequestId;
   private String deliveryType;
   private String deliveryAddress;
   private String status;
   private String agentName;
   public Delivery() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Long getDeliveryId() {
	return deliveryId;
   }
   public Long getServiceRequestId() {
	return serviceRequestId;
   }
   public String getDeliveryType() {
	return deliveryType;
   }
   public String getDeliveryAddress() {
	return deliveryAddress;
   }
   public String getStatus() {
	return status;
   }
   public String getAgentName() {
	return agentName;
   }
   public void setDeliveryId(Long deliveryId) {
	this.deliveryId = deliveryId;
   }
   public void setServiceRequestId(Long serviceRequestId) {
	this.serviceRequestId = serviceRequestId;
   }
   public void setDeliveryType(String deliveryType) {
	this.deliveryType = deliveryType;
   }
   public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
   }
   public void setStatus(String status) {
	this.status = status;
   }
   public void setAgentName(String agentName) {
	this.agentName = agentName;
   }
   
}
