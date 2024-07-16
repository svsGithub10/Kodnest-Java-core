package com.strings.palindrome;

import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		Palindrome P=new Palindrome();
		System.out.println(P.check(S));
	}

}
