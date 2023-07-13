package com.VehicalMS.Main;
import java.util.*;

import com.VehicalMS.Implementation.VehicalMSImplementation;
import com.VehicalMS.Service.Vehical;

public class VehicalManagementSystemMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		VehicalMSImplementation vi=new VehicalMSImplementation();
		char c;
		
		do
		{
			System.out.println("Welcome to Vehical Management System Please Enter Your Choice");
			System.out.println("1.Add Vehical\n2.Display All Vehical\n3.Remove Vehical\n4.Search By Vehical Name\n5.Search By Model Number\n6.Search By Vehical Type\n7.Add Service Record\n8.Display History of Servicing");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:vi.addVeical(null);
			break;
			case 2:vi.displayAllVehicals();
			break;
			case 3:vi.removeVehical(choice);
			break;
			case 4:vi.searchByVehicalName(null);
			break;
			case 5:vi.searchByModelno(choice);
			break;
			case 6:vi.searchByVehicalType(null);
			break;
			case 7:vi.addServiceRecord(null);
			break;
			case 8:vi.displayServiceHistory();
			}
			System.out.println(".....................Do Yoy Want To Continue............");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');

	}

}
