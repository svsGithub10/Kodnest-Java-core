package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class PolygonApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Polygon p=new Polygon();	//creating the Polygon class object
		System.out.println("Enter the number of sides of a polygon:");
		int s=sc.nextInt();	//scanning the user value
		p.Identify(s); 	//calling the Identify() method using Polygon  class object
	}

}
