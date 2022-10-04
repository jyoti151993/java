package com.app.core;

public class DeliveryAddress {
	private String adrLine1;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	@Override
	public String toString() {
		return "DeliveryAddress [adrLine1=" + adrLine1 + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipCode=" + zipCode + "]";
	}
	public DeliveryAddress(String adrLine1, String city, String state, String country, String zipCode) {
		super();
		this.adrLine1 = adrLine1;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode =zipCode;
	}
	

}
