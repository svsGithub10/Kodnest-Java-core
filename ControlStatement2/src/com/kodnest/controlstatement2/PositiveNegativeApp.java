package com.kodnest.controlstatement2;

import java.util.Scanner;	//importing the scanner package

public class PositiveNegativeApp {

	public static void main(String[] args) {	//creating the main method
			Scanner sc=new Scanner(System.in);	//creating a scanner object
			System.out.println("Enter a number");	
			int a=sc.nextInt();	//creating a integer variable and scanning the user value
			PositiveNegative p=new PositiveNegative();	//creating the PositiveNegative class object
			p.num(a);	//calling num() method through the object

	}

}
