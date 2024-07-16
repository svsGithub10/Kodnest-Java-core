package com.kodnest.controlstatement2;

import java.util.Scanner;	//importing the scanner package

public class VotingApp {	

	public static void main(String[] args) {	//creating the main method
		Scanner sc=new Scanner(System.in);	//creating a scanner object
		Voting v=new Voting();	//creating the Voting class object
		System.out.println("Enter your age :");
		int age=sc.nextInt();	//creating a integer variable and scanning the user value
		v.Age(age);	//calling Age() method through the object

	}

}
