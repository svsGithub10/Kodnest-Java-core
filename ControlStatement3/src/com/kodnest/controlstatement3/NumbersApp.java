package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class NumbersApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Numbers N=new Numbers();	//creating the class object
		//scanning the user inputs
		System.out.println("Enter 3 numbers :");
		int a=sc.nextInt();	
		int b=sc.nextInt();
		int c=sc.nextInt();
		N.check(a,b,c); 	//calling the method using class object
	}

}
