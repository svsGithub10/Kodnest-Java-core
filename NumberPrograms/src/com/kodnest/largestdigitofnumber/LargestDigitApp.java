package com.kodnest.largestdigitofnumber;

import java.util.Scanner;

public class LargestDigitApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the number : ");
		long n=sc.nextLong();	//Getting the user value
		sc.close(); 	//closing the scanner object
		LargestDigit P=new LargestDigit();	//creating the class object
		P.find(n);	//Calling the find method for result
	}
}
