package com.kodnest.sumofsquares;

import java.util.Scanner;

public class SumOfSquaresApp {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);	//Creating scanner object
			System.out.print("Enter the value of n : ");
			int n=sc.nextInt();	//Getting the user value
			sc.close(); 	//closing the scanner object
			SumOfSquares S=new SumOfSquares();	//creating the class object
			S.result(n);	//Calling the result method for result
	}
}
