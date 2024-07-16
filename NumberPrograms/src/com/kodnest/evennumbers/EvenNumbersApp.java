package com.kodnest.evennumbers;

import java.util.Scanner;

public class EvenNumbersApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		EvenNumbers E=new EvenNumbers();	//creating the class object
		E.display(n);	//Calling the display method for result
	}

}
