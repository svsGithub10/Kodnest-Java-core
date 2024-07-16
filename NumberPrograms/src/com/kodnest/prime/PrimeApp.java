package com.kodnest.prime;

import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		Prime P=new Prime();	//creating the class object
		P.display(n);	//Calling the display method for result
	}

}
