package com.kodnest.controlstatement2;

import java.util.Scanner; //importing the scanner package

public class AdultApp {
	public static void main(String[] args) { //creating the main method
		Scanner sc=new Scanner(System.in); //creating a scanner object
		System.out.println("Enter the age"); 
		int age=sc.nextInt(); //creating a integer variable and scanning the user value
		Adult a=new Adult(); //creating the Adult class object
		a.Age(age); //calling Age() method through the object
	}
}
