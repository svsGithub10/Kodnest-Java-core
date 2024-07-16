package com.kodnest.controlstatement2;

import java.util.Scanner;	//importing the scanner package

public class LeapYearApp {

	public static void main(String[] args) {	//creating the main method
		Scanner sc=new Scanner(System.in);	//creating a scanner object
		System.out.println("Enter the year:");	
		int year=sc.nextInt(); //creating a integer variable and scanning the user value
		LeapYear Y=new LeapYear();	//creating the LeapYear class object
		Y.year(year); //calling the year() method through the object

	}

}
