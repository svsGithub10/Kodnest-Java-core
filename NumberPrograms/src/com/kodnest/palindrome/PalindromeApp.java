package com.kodnest.palindrome;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating scanner object
		System.out.print("Enter the value of n : ");
		long n = sc.nextLong(); // Getting the user value
		sc.close(); // closing the scanner object
		Palindrome P = new Palindrome(); // creating the class object
		P.check(n); // Calling the check method for result

	}

}
