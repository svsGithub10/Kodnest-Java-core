package com.kodnest.methods3;

import java.util.Scanner;

public class AlphabetsApp {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//Creating the scanner object
		Alphabets A=new Alphabets();	//Creating the class object
		while(true) {	//to repeat the process
		System.out.print("Enter a charecter : ");
		char ch=sc.next().charAt(0);	//reading the user input
		A.verify(ch);	//calling the verify() method using class object
		System.out.print("Do you want to continue? (y/n): ");
		char d=sc.next().charAt(0);	//get the decision if user want to continue or not
		if(d!='y' && d!='n') {
			System.out.print("Invalid decision");	//if decision is invalid
			break;
		}
		if(d=='n') break;	//if decision is no (n) then break and exit the program
		System.out.println();
		}

	}

}
