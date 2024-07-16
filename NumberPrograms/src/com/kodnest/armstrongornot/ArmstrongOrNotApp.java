package com.kodnest.armstrongornot;

import java.util.Scanner;

public class ArmstrongOrNotApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		long n=sc.nextLong();	//Getting the user value
		sc.close(); 	//closing the scanner object
		ArmstrongOrNot S=new ArmstrongOrNot();	//creating the class object
		S.check(n);	//Calling the display method for result
	}

}
