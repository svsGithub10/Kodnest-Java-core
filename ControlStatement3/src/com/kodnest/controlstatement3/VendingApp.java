package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class VendingApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Vending v=new Vending();	//creating the Vending class object
		System.out.println("Enter the product ID:");
		String s=sc.nextLine();	//scanning the user value
		v.Pick(s); 	//calling the Pick() method using Vending class object
	}

}
