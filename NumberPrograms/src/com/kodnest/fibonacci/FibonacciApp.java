package com.kodnest.fibonacci;

import java.util.Scanner;

public class FibonacciApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		Fibonacci F=new Fibonacci();	//creating the class object
		F.display(n);	//Calling the display method for result
	}

}
