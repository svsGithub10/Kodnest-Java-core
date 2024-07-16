package com.kodnest.pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //creating scanner object
		System.out.print("Enter the value of n :");
		int n=sc.nextInt(); //read the value of n
		System.out.print("Enter the chrecter to print :");
		char ch=sc.next().charAt(0); //read the character
		for(int i=n;i>=1;i--) {			//for(i=1;i<=n;i++)
			for(int j=1;j<=i;j++) {		//for(j=1;j<=(n-i+1);j++)
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {		//for(j=1;j<=(n-i+1);j++)
				System.out.print(ch);
			}
				
			System.out.println();
		}

	}

}
