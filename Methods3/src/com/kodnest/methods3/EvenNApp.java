package com.kodnest.methods3;

import java.util.Scanner;

public class EvenNApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//scanner object
		EvenN E=new EvenN();	//class object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//scan the user value
		E.even(n);	//calling the even() function
	}

}
