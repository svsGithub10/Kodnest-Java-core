package com.recursion.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt(),res=1;
		factorial(n,res);
		sc.close();
	}
	public static void factorial(int n,int res) {
		if(n==0) {
			System.out.println("Factorial of given number: "+res);
			return;
		}
		else {
			res=res*n;
			factorial(n-1,res);
		}
	}
}
