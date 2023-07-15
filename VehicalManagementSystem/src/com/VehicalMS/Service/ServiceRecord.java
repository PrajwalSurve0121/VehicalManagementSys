package com.VehicalMS.Service;

public class ServiceRecord {
	
	private String date;
	private String description;
	private double cost;
	 
	
	public ServiceRecord()
	{
		
	}

	public ServiceRecord(String date, String description, double cost) {
		
		this.date = date;
		this.description = description;
		this.cost = cost;
	}

	

	@Override
	public String toString() {
		return "ServiceRecord [date=" + date + ", description=" + description + ", cost=" + cost + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
