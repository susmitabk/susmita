package com.sapient.service;

public class Interest 
{

	public double amt;
	public int years;
	public float rate;
	 
	public double calSimple()
	{
		double si = amt * years * rate /100;
		return si;
	
	}
	public double calCompound()
	{
		double ci = amt * Math.pow((1 + rate/100), years);
		return ci;
	
	}
}
