package com.VehicalMS.Service;

public class VehicalType {
	
	private int typeID;
	private String typename;
	
	public VehicalType()
	{
		
	}

	public VehicalType(int typeID, String typename) {
		this.typeID = typeID;
		this.typename = typename;
	}

	@Override
	public String toString() {
		return "VehicalType [typeID=" + typeID + ", typename=" + typename + "]";
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
	

}
