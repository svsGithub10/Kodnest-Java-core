package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class PowerApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Power P=new Power();	//creating the class object
		//scanning the user input
		System.out.println("Enter the base value :");
		int b=sc.nextInt();	
		System.out.println("Enter the power value :");
		int p=sc.nextInt();	
		
		P.calculate(b,p); 	//calling the method using class object
	}

}
