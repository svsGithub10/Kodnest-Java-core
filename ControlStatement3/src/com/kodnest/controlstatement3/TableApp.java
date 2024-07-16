package com.kodnest.controlstatement3;

import java.util.Scanner; //importing the scanner package

public class TableApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Table T=new Table();	//creating the class object
		//scanning the user input
		System.out.println("Enter the number :");
		int a=sc.nextInt();	
		T.printTable(a); 	//calling the method using class object
	}

}
