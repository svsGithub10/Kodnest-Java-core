package com.kodnest.power;

import java.util.Scanner;

public class PowerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the base value b = ");
		int b=sc.nextInt();	//Getting the user value
		System.out.print("Enter the power value p = ");
		int p=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		Power P=new Power();	//creating the class object
		P.calculate(b,p);	//Calling the display method for result
	}
}
