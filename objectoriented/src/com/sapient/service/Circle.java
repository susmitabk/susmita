package com.sapient.service;

public class Circle {

	public double radius;
	
	public double calArea()
	{
		double ar = Math.PI*(Math.pow(radius, 2));
		return ar;
	
	}
	public double calPeri()
	{
		double pr = 2 * Math.PI* radius;
		return pr;
	}
	 
}
