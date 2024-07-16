package com.kodnest.sumofdigits;

import java.util.Scanner;

public class SumOfDigitApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		long n=sc.nextLong();	//Getting the user value
		sc.close(); 	//closing the scanner object
		SumOfDigit P=new SumOfDigit();	//creating the class object
		P.calculate(n);	//Calling the display method for result
	}

}
