package com.kodnest.methods3;

import java.util.Scanner;

public class SumOfDigitApp {

	public static void main(String[] args) { //main
		Scanner sc=new Scanner(System.in);	//scanner object
		SumOfDigits S=new SumOfDigits();	//class object
		System.out.println("Eneter a number : ");
		long a=sc.nextLong();	//scanning the user value
		S.evaluate(a);	//calling the function
	}

}
