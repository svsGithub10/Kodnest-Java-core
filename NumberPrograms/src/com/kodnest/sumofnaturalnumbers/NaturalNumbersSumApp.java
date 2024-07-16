package com.kodnest.sumofnaturalnumbers;

import java.util.Scanner;

public class NaturalNumbersSumApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		NaturalNumbersSum N=new NaturalNumbersSum();	//creating the class object
		N.sumOfSeries(n);	//Calling the display method for result
	}

}
