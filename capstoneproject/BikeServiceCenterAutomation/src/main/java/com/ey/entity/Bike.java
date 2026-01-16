package com.ey.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bikeId;
    private String bikeName;
    private String model;
    private String numberPlate;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getBikeId() {
		return bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public String getModel() {
		return model;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	
    
}
 