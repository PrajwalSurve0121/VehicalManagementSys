package com.VehicalMS.Implementation;
import java.util.ArrayList;
import java.util.Scanner;

import com.VehicalMS.Service.ServiceRecord;
import com.VehicalMS.Service.Vehical;
import com.VehicalMS.Service.VehicalServiceManager;
import com.VehicalMS.Service.VehicalType;

public class VehicalMSImplementation implements VehicalServiceManager{
	
	Scanner sc=new Scanner(System.in);
	Vehical v=new Vehical();
	VehicalType vt=new VehicalType();
	ServiceRecord sr=new ServiceRecord();
	
	ArrayList<Vehical>list=new ArrayList<>();
	ArrayList<ServiceRecord>list1=new ArrayList<>();

	@Override
	public Vehical addVeical(Vehical ve) {
		
		System.out.println("...........................Please Enter number for adding Vehical...........................");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println(".........Enter Vehical Details..............");
			System.out.println("Enter Vehical Id: ");
			int vid=sc.nextInt();
			System.out.println("Enter Vehical Name: ");
			String vename=sc.next();
			System.out.println("Enter Vehicle Number Plate");
			String numberPlate=sc.next();
			System.out.println("Enter Model Number of Vehical: ");
			int modNo=sc.nextInt();
			System.out.println("Enter Vehical Year of Manufacturing");
			int vyear=sc.nextInt();
			System.out.println("Enter Vehical Mileage");
			int vmileage=sc.nextInt();
			System.out.println("........Enter Vehical Type Details......");
			System.out.println("ENter Vehical Type ID: ");
			int typeid=sc.nextInt();
			System.out.println("Eneter Vehical Type: ");
			String vtype=sc.next();
//			System.out.println(".........................Enter Servicing Record...............");
//			System.out.println("Enter Date of Servicing");
//			String date=sc.next();
//			System.out.println("Enter Desctription Of Servicing Record");
//			String desc=sc.next();
//			System.out.println("Enter Servicing Cost: ");
//			int cost=sc.nextInt();
			VehicalType vs=new VehicalType(typeid,vtype);
			ServiceRecord sr=new ServiceRecord();
			list.add(new Vehical(vid,vename,numberPlate,modNo,vyear,vmileage,vs,sr));
//			list1.add(new ServiceRecord(k,date,desc,cost));
			
		}
		return ve;
	}

	@Override
	public void displayAllVehicals() {
		System.out.println(".....................Display All Vehical..............");
		if(list.isEmpty())
		{
			System.out.println("Vehical List is Empty please add vehical");
		}
		else
		{
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
		}
		
	}

	@Override
	public int removeVehical(int vid) {

		System.out.println("............Remove Vehical Based on Vehical ID..................");
		System.out.println("Enter Id for remove Vehical");
		vid=sc.nextInt();
		if(list.isEmpty())
		{
			System.out.println("Can't remove Your Vehical due to List is Empty please add vehical");
		}
		else
		{
			boolean ispresent=false;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getVehicalID()==vid)
				{
					ispresent=true;
					break;
				}
			}
			if(ispresent==true)
			{
				for(int j=0;j<list.size();j++)
				{
					if(list.get(j).getVehicalID()==vid)
					{
						list.remove(j);
						System.out.println("Vehical is Sucessful Removed");
					}
				}
			}
			else
			{
				System.out.println("Can't remove Your Vehical due to List is Empty please add vehical");
			}
		}

		return vid;
	}

	@Override
	public String searchByVehicalName(String vname) {
		
		System.out.println(".................Display Vehical By Searching on its name................ ");
		System.out.println("Enter Vehical Name For Search");
		vname=sc.next();
		if(list.isEmpty())
		{
			System.out.println("Your Search by Name is Invalid Due to Vehical List is Empty");
		}
		else
		{
			boolean namepresent=false;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getVehicalname().equalsIgnoreCase(vname))
				{
					namepresent=true;
					break;
				}
			}
			if(namepresent==true)
			{
				for(int j=0;j<list.size();j++)
				{
					if(list.get(j).getVehicalname().equalsIgnoreCase(vname))
					{
						System.out.println(list.get(j));
					}
				}
			}
			else
			{
				System.out.println("Your Search by Name is Invalid Due to Vehical List is Empty");
			}
		}
		return vname;
	}

	@Override
	public int searchByModelno(int mno) {
		System.out.println(".................Display Vehical By Searching on its Model Number................ ");
		System.out.println("Enter Vehical Model Number For Search");
		mno=sc.nextInt();
		if(list.isEmpty())
		{
			System.out.println("Your Search by ID is Invalid Due to Vehical List is Empty");
		}
		else
		{
			boolean modelnopre=false;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getModelno()==mno)
				{
					modelnopre=true;
					break;
				}
			}
			if(modelnopre==true)
			{
				for(int j=0;j<list.size();j++)
				{
					if(list.get(j).getModelno()==mno)
					{
						System.out.println(list.get(j));
					}
				}
			}
			else
			{
				System.out.println("Can't searched Due Vehical List is Empty");
			}
		}
		

		return mno;
	}

	@Override
	public String searchByVehicalType(String vtypename) {
		System.out.println("...........Display Vehical By Searching on its Vehical Type...............");
		System.out.println("Enter Vehical Type");
		vtypename=sc.next();
		if(list.isEmpty())
		{
			System.out.println("Your Search by Type Name of Vehical is Invalid Due to Vehical List is Empty");
		}
		else
		{
			boolean typename=false;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getType().getTypename().equalsIgnoreCase(vtypename))
				{
					typename=true;
					break;
				}
			}
			if(typename==true)
			{
				for(int j=0;j<list.size();j++)
				{
					if(list.get(j).getType().getTypename().equalsIgnoreCase(vtypename))
					{
						System.out.println(list.get(j));
					}
				}
			}
			else
			{
				System.out.println("Can't searched Due Vehical List is Empty");
            }
		}
		
		
		return vtypename;
	}

	@Override
	public int addServiceRecord(int id) {
		System.out.println("Enter Servicing Record of the Vehical");
		System.out.println("Enter Id to add Servicing Record: ");
		id=sc.nextInt();
		boolean isPresent=false;
		for(int i=0;i<list.size();i++)
		{			
			if(list.get(i).getVehicalID()==id)
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent==true)
		{
			for(int j=0;j<list.size();j++)
			{			
				if(list.get(j).getVehicalID()==id)
				{
					System.out.println("Enter Date of the Servicing");
					String date=sc.next();
					System.out.println("Description of Vehical");
					String desc=sc.next();
					System.out.println("Enter Cost of Servicing");
					double cost=sc.nextDouble();
					list1.add(new ServiceRecord(date,desc,cost));
				}
			}
		}
		else
		{
			System.out.println("Vehical ID Doesn't Exists");
		}
		return id;
	}
	
	
	@Override
	public void displayServiceHistory()
	{
		System.out.println(".....................Display Servicing History..............");
		if(list1.isEmpty())
		{
			System.out.println("No Servicing Details");
		}
		else
		{
			for(int i=0;i<list1.size();i++)
			{
				System.out.println(list.get(i).getVehicalID()+" "+list.get(i).getVehicalname()+" "+list1.get(i));
            }
		}
	}
	
		

	
}
