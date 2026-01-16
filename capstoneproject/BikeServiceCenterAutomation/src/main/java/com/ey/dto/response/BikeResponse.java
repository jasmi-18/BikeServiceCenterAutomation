package com.ey.dto.response;

public class BikeResponse {
	
	
	 private Long bikeId;
	   private String bikeName;
	   private String model;
	   public BikeResponse() {
		super();
		// TODO Auto-generated constructor stub
	   }
	   public BikeResponse(Long bikeId, String bikeName, String model) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.model = model;
	   }
	   public Long getBikeId() {
		   return bikeId;
	   }
	   public void setBikeId(Long bikeId) {
		   this.bikeId = bikeId;
	   }
	   public String getBikeName() {
		   return bikeName;
	   }
	   public void setBikeName(String bikeName) {
		   this.bikeName = bikeName;
	   }
	   public String getModel() {
		   return model;
	   }
	   public void setModel(String model) {
		   this.model = model;
	   }
	   
	   

}
