package com.kodnest.pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //creating scanner object
		System.out.print("Enter the value of n :");
		int n=sc.nextInt(); //read the value of n
		System.out.print("Enter the chrecter to print :");
		char ch=sc.next().charAt(0); //read the character
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i+1);j++) {			//n-i+1 (for reverse)
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {	//k<=i     logic=2*i-1
				System.out.print(ch);
			}
//			for(int l=2;l<=i;l++) {
//				System.out.print(ch);
//			}
				
			System.out.println();
		}

	}

}
