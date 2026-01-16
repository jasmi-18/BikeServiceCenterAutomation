package com.ey.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long paymentId;
   private Long serviceRequestId;
   private Double amount;
   private String status;
   public Payment() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Long getPaymentId() {
	return paymentId;
   }
   public Long getServiceRequestId() {
	return serviceRequestId;
   }
   public Double getAmount() {
	return amount;
   }
   public String getStatus() {
	return status;
   }
   public void setPaymentId(Long paymentId) {
	this.paymentId = paymentId;
   }
   public void setServiceRequestId(Long serviceRequestId) {
	this.serviceRequestId = serviceRequestId;
   }
   public void setAmount(Double amount) {
	this.amount = amount;
   }
   public void setStatus(String status) {
	this.status = status;
   }
   
   
}