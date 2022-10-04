package com.app.core;

public enum Category {
	PETROL ,DIESEL, HYBRID, CNG, EV;
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
