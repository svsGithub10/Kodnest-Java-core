package com.kodnest.sumofdigits2;

import java.util.Scanner;

public class SumOfDigit2App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		long n=sc.nextLong();	//Getting the user value
		sc.close(); 	//closing the scanner object
		SumOfDigit2 S=new SumOfDigit2();	//creating the class object
		S.calculate(n);	//Calling the display method for result
	}
}
