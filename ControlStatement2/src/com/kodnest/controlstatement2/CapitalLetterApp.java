package com.kodnest.controlstatement2;

import java.util.Scanner; //importing the scanner package

public class CapitalLetterApp { //creating the main method

	public static void main(String[] args) { //creating a scanner object
		Scanner sc=new Scanner(System.in); //creating a scanner object
		CapitalLetter C=new CapitalLetter(); //creating the CapitalLetter class object
		System.out.println("Enter a Letter :");
		char c=sc.next().charAt(0); //creating a character variable and scanning the user value
		C.Letter(c); //calling Letter() method through the object

	}

}
