package com.kodnest.controlstatement2;

import java.util.Scanner; //importing the scanner package

public class DiscountApp {

	public static void main(String[] args) { //creating the main method
		Scanner sc=new Scanner(System.in); //creating a scanner object
		Discount d=new Discount();	//creating the Discount class object
		System.out.print("Enter the amount: $");
		int amt=sc.nextInt(); //creating a integer variable and scanning the user value
		d.Purchase(amt);	//calling Purchase() method through the object
	}

}
