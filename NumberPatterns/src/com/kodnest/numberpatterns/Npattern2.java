package com.kodnest.numberpatterns;

import java.util.Scanner;

public class Npattern2 {

	public static void main(String[] args) {	//main method
		Scanner sc=new Scanner(System.in);	//scanner object
		System.out.print("Enter the value of n :");
		int n=sc.nextInt();	//get the user value
		for(int i=1;i<=n;i++) {	//no of rows
			for(int j=1;j<=n;j++) {	//no of columns
				System.out.print(j);	//column number will be same in a row
			}
			System.out.println();
		}

	}

}
