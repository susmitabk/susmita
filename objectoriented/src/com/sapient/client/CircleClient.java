package com.sapient.client;
import java.util.Scanner;

import com.sapient.service.Circle;



public class CircleClient {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius");
		double rad = scan.nextDouble();
		
		
		scan.close(); 
		
		Circle obj = new Circle();
		obj.radius= rad;
		double ar = obj.calArea();
		double pr = obj.calPeri();
		System.out.println("area=" + ar);
		System.out.println("peri=" + pr);
	}
}
