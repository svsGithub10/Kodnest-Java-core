package com.kodnest.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating scanner object
		System.out.print("Enter the value of n :");
		int n = sc.nextInt(); // read the value of n
		System.out.print("Enter the chrecter to print :");
		char ch = sc.next().charAt(0); // read the character

		/*
		 * //Using for loop for(int i=1;i<=n;i++) { System.out.print(ch); }
		 */

		/*
		 * //Using while loop int i=1; while(i<=n) { System.out.print(ch); i++; }
		 */

		// Using do while loop
		int i = 1;
		do {
			System.out.print(ch);
			i++;
		} while (i <= n);

	}

}
