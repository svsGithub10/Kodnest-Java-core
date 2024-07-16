package com.kodnest.methods3;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {	//main
		Scanner sc=new Scanner(System.in);	//scanner object
		Factorial F=new Factorial();	//class object
		System.out.print("Eneter a number : ");
		int n=sc.nextInt();	//scanning the user value
		F.fact(n); 	//calling the fact() method5
	}

}
