package com.kodnest.controlstatement2;

import java.util.Scanner;	//importing the scanner package

public class Multipleof10App {

	public static void main(String[] args) {	//creating the main method
		Scanner sc=new Scanner(System.in);	//creating a scanner object
		Multipleof10 m=new Multipleof10();	//creating the Discount class object
		System.out.println("Enter the number:");
		int num=sc.nextInt();	//creating a integer variable and scanning the user value
		m.check(num);	//calling check() method through the object
	}

}
