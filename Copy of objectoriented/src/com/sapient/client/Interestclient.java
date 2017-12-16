package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class Interestclient {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amount");
		double pamt = scan.nextDouble();
		System.out.println("Enter the years");
		int terms = scan.nextInt();
		System.out.println("Enter the rate");
		float per = scan.nextFloat();
		scan.close();
		Interest obj = new Interest();
		obj.amt= pamt;
		obj.rate= per;
		obj.years= terms;
		double si= obj.calSimple();
		double ci= obj.calCompound();
		System.out.println("simple=" + si);
		System.out.println("compound=" + ci);
		
	
	}

}
