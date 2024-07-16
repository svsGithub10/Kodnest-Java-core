package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class SumofNApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		SumofN S=new SumofN();	//creating the class object
		//scanning the user input
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();	
		S.series(n); 	//calling the method using class object
	}

}
