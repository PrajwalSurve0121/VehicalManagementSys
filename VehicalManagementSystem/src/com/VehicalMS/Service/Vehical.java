package com.VehicalMS.Service;

public class Vehical {
	
	private int vehicalID;
	private String vehicalname;
	private String numberPlate;
	private int modelno;
	private int year;
	private int mileage;
	private VehicalType type;
	private ServiceRecord s;
	
	public Vehical()
	{
		
	}

	public Vehical(int vehicalID, String vehicalname, String numberPlate, int modelno, int year, int mileage,
			VehicalType type, ServiceRecord s) {
		this.vehicalID = vehicalID;
		this.vehicalname = vehicalname;
		this.numberPlate = numberPlate;
		this.modelno = modelno;
		this.year = year;
		this.mileage = mileage;
		this.type = type;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Vehical [vehicalID=" + vehicalID + ", vehicalname=" + vehicalname + ", numberPlate=" + numberPlate
				+ ", modelno=" + modelno + ", year=" + year + ", mileage=" + mileage + ", type=" + type + ", s=" + s
				+ "]";
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

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
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

	public VehicalType getType() {
		return type;
	}

	public void setType(VehicalType type) {
		this.type = type;
	}

	public ServiceRecord getS() {
		return s;
	}

	public void setS(ServiceRecord s) {
		this.s = s;
	}
	

	
}
