package com.kodnest.gcd;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.println("Enter the value of a & b :");
		System.out.print("a = ");
		int a=sc.nextInt();	//scanning a value
		System.out.print("b = ");
		int b=sc.nextInt();	//scanning b value
		sc.close();	//closing scanner
		GCD G=new GCD();	//creating class object
		G.result(a,b);	//calling result method to print the result
	}

}
