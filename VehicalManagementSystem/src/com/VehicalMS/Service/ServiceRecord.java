package com.VehicalMS.Service;

public class ServiceRecord {
	
	private Vehical ve;
	private int date;
	private String description;
	private double cost;
	
	public ServiceRecord()
	{
		
	}

	public ServiceRecord(Vehical ve, int date, String description, double cost) {
		this.ve = ve;
		this.date = date;
		this.description = description;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ServiceRecord [ve=" + ve + ", date=" + date + ", description=" + description + ", cost=" + cost + "]";
	}

	public Vehical getVe() {
		return ve;
	}

	public void setVe(Vehical ve) {
		this.ve = ve;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
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
