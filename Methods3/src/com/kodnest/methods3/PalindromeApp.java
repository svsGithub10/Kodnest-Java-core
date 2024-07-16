package com.kodnest.methods3;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {	//main
		Scanner sc=new Scanner(System.in);	//scanner object
		System.out.print("Enter a number : ");
		long n=sc.nextLong();	//scanning the user value
		Palindrome P=new Palindrome();	//class object
		P.check(n);	//calling the check() method
	}

}
