package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String chasisNo;// unique ID
	private String model;
	private double price;
	// add manufacture date n make necessary changes
	private Date manufactureDate;
	//add HAS-A (association) relationship between Vehicle n it's Category
	private Category vehicleCategory;
	// establish HAS-A relationship(association / containment) between Vehicle n
		// it's address
	private DeliveryAddress address;
	// create instance of SINGLE SimpleDateFormat class : for parsing(string--->
	// Date) n for formatting (Date --> string)
	public static SimpleDateFormat sdf;// sdf=null
	static {
		// init SDF with pattern
		sdf = new SimpleDateFormat("yr-mon-day");
	}

	public Vehicle(String chasisNo, String model, double price, Date manufactureDate,Category cat) {
		super();
		this.chasisNo = chasisNo;
		this.model = model;
		this.price = price;
		this.manufactureDate = manufactureDate;
		vehicleCategory=cat;
	}
	
//add overloaded constructor to encapsulate primary key members or Unique ID
	public Vehicle(String chasisNo, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.manufactureDate = manufactureDate;
	}


	@Override
	
	public String toString() {
		String addrInfo=address==null?"Address Not yet Assigned":address.toString();
		return "Vehicle [chasisNo=" + chasisNo + ", model=" + model + ", price=" + price + " manufactured on "
				+ sdf.format(manufactureDate)+" Category : "+vehicleCategory;
	}

	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in vehicle's equals");
		if (anotherObject instanceof Vehicle) {
			Vehicle anotherVehicle = (Vehicle) anotherObject;
			return chasisNo.equals(anotherVehicle.chasisNo) 
					&& manufactureDate.equals(anotherVehicle.manufactureDate);
			// Based upon String's equals (ie. content equality)
			// return chasisNo == (anotherVehicle.chasisNo);
		}
		return false;
	}
	//add a getter for the address
	
	public DeliveryAddress getAddress() {
		return address;
	}
	public String linkDeliveryAddress(String adrLine, String city, String state, String country, String zipCode) {
	address=new DeliveryAddress(adrLine,city,state,country,zipCode);
		return "Delivery Address Linked....";
		
	}
	

}
