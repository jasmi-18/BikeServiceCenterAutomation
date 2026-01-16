package com.ey.dto.request;

public class AddBikeRequest {
	   private String bikeName;
	   private String model;
	   private String numberPlate;
	   public AddBikeRequest() {
		super();
		// TODO Auto-generated constructor stub
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
	   public String getNumberPlate() {
		   return numberPlate;
	   }
	   public void setNumberPlate(String numberPlate) {
		   this.numberPlate = numberPlate;
	   }
	   
}