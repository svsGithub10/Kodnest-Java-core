package com.kodnest.controlstatement3;

import java.util.Scanner;	//importing the scanner package

public class AgeApp {

	public static void main(String[] args) { //creating main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Age a=new Age();	//Creating the Age class object
		System.out.println("Enter the age of the person :");
		int age=sc.nextInt(); //scanning the user input and storing it in integer value
		a.Validate(age);
	}

}
