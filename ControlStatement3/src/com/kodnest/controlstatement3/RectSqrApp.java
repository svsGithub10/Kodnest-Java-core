package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class RectSqrApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		RectSqr r=new RectSqr();	//creating the RectSqr class object
		System.out.println("Enter the length of the rectangle:");
		int l=sc.nextInt();	//scanning the length
		System.out.println("Enter the breadth of the rectangle:");
		int b=sc.nextInt();	//scanning the breadth
		r.Valid(l,b); 	//calling the Valid() method using class object
	}

}
