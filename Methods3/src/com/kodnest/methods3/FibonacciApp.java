package com.kodnest.methods3;

import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//scanner object
		Fibonacci F=new Fibonacci();	//class object
		System.out.print("Enter the range : ");
		int a=sc.nextInt(); //reading the user value
		F.series(a);	//calling the function
	}

}
