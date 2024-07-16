package com.kodnest.controlstatement2;

import java.util.Scanner;	//importing the scanner package

public class SeniorApp {

	public static void main(String[] args) {	//creating the main method
		Scanner sc=new Scanner(System.in);	//creating a scanner object
		System.out.println("Enter the age of the person:");
		int age=sc.nextInt();	//creating a integer variable and scanning the user value
		Senior S=new Senior();	//creating the Senior class object
		S.person(age);	//calling person() method through the object

	}

}
