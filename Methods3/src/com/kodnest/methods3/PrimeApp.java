package com.kodnest.methods3;

import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//scanner object
		Prime P=new Prime();	//class object
		System.out.print("Enter the range : ");
		int a=sc.nextInt();	//reading the user value
		P.getPrime(a);	//calling the getPrime() function
	}

}
