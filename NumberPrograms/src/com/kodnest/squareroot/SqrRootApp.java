package com.kodnest.squareroot;

import java.util.Scanner;

public class SqrRootApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the number : ");
		double n=sc.nextLong();	//Getting the user value
		sc.close(); 	//closing the scanner object
		SqrRoot S=new SqrRoot();	//creating the class object
		S.get(n);	//Calling the find method for result
	}
}
