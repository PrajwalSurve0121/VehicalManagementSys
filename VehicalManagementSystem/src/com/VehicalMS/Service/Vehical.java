package com.VehicalMS.Service;

public class Vehical {
	
	private int vehicalID;
	private String vehicalname;
	private int modelno;
	private VehicalType type;
	private int year;
	private int mileage;
	
	public Vehical()
	{
		
	}

	public Vehical(int vehicalID, String vehicalname, int modelno, VehicalType type, int year, int mileage) {
		this.vehicalID = vehicalID;
		this.vehicalname = vehicalname;
		this.modelno = modelno;
		this.type = type;
		this.year = year;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehical [vehicalID=" + vehicalID + ", vehicalname=" + vehicalname + ", modelno=" + modelno + ", type="
				+ type + ", year=" + year + ", mileage=" + mileage + "]";
	}

	public int getVehicalID() {
		return vehicalID;
	}

	public void setVehicalID(int vehicalID) {
		this.vehicalID = vehicalID;
	}

	public String getVehicalname() {
		return vehicalname;
	}

	public void setVehicalname(String vehicalname) {
		this.vehicalname = vehicalname;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public VehicalType getType() {
		return type;
	}

	public void setType(VehicalType type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	

}
