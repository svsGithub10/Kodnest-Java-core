package com.kodnest.armstrong;

import java.util.Scanner;

public class ArmstrongApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		long n=sc.nextLong();	//Getting the user value
		sc.close(); 	//closing the scanner object
		Armstrong S=new Armstrong();	//creating the class object
		S.display(n);	//Calling the display method for result
	}

}
