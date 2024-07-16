package com.kodnest.pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) { //main method
		Scanner sc=new Scanner(System.in); //creating scanner object
		System.out.print("Enter the value of n :");
		int n=sc.nextInt(); //read the value of n
		System.out.print("Enter the chrecter to print :");
		char ch=sc.next().charAt(0); //read the character
		for(int i=1;i<=n;i++) {	//number of rows
			for(int j=1;j<=n;j++) {	//number of columns
				System.out.print(" ");	//prints first n spaces
			}
			for(int k=1;k<=n;k++) {
				if(i==1 || k==1 || i==n || k==n) System.out.print(ch);//prints the border of pattern
				else System.out.print(" ");	//mid spaces of pattern
			}
			System.out.println();	//to break the line after a row
		}

	}

}