package com.VehicalMS.Service;

public interface VehicalServiceManager {
	
	public Vehical addVeical(Vehical ve);
	public void displayAllVehicals();
	public int removeVehical(int vid);
	public String searchByVehicalName(String vname);
	public int searchByModelno(int mno);
	public String searchByVehicalType(String vtypename);
	public ServiceRecord addServiceRecord(ServiceRecord serRecord);
	public void displayServiceHistory();
	
	

}
