package com.ey.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estimation {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long estimationId;
   private Long serviceRequestId;
   private Double amount;
   private String remarks;
   private String status;
   public Estimation() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Long getEstimationId() {
	return estimationId;
   }
   public Long getServiceRequestId() {
	return serviceRequestId;
   }
   public Double getAmount() {
	return amount;
   }
   public String getRemarks() {
	return remarks;
   }
   public String getStatus() {
	return status;
   }
   public void setEstimationId(Long estimationId) {
	this.estimationId = estimationId;
   }
   public void setServiceRequestId(Long serviceRequestId) {
	this.serviceRequestId = serviceRequestId;
   }
   public void setAmount(Double amount) {
	this.amount = amount;
   }
   public void setRemarks(String remarks) {
	this.remarks = remarks;
   }
   public void setStatus(String status) {
	this.status = status;
   }
   
   
}