package com.kodnest.factorial;

import java.util.Scanner;

public class FactorialApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		Factorial F=new Factorial();	//creating the class object
		F.calculate(n);	//Calling the calculate method for result
	}
}
