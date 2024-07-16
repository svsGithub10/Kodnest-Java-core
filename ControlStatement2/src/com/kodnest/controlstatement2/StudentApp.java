package com.kodnest.controlstatement2;

import java.util.Scanner;	//importing the scanner package

public class StudentApp {

	public static void main(String[] args) {	//creating the main method
			Scanner sc=new Scanner(System.in);	//creating a scanner object
			System.out.println("Enter the marks");
			int m=sc.nextInt();	//creating a integer variable and scanning the user value
			Student S=new Student();	//creating the Senior class object
			S.result(m);	//calling result() method through the object

	}

}
