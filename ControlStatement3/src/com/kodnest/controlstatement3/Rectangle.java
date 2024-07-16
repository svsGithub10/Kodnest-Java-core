package com.kodnest.controlstatement3;

import java.util.Scanner; //importing scanner package

public class Rectangle {	//creating a static method to calculate area
	public static void area(double l, double b) {
		System.out.println("Area ="+(l*b));	//printing the result
	}
	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating scanner object
		System.out.println("Enter the length and breadth :");
		double l=sc.nextDouble();	//creating and storing the user value
		double b=sc.nextDouble();	//creating and storing the user value
		area(l,b);	//calling the area() method
	}
}
