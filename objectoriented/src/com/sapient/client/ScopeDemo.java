package com.sapient.client;
import java.util.ResourceBundle;

public class ScopeDemo {
	public static final String UNAME;
	public static final String PWD;
	static{
		System.out.println("static block");
		ResourceBundle rb = ResourceBundle.getBundle("sap");
		UNAME = rb.getString("uname");
		PWD = rb.getString("pwd");
		
	}
	public static void main(String[] args)
	{
		System.out.println(UNAME + " " + PWD);
	}

}
