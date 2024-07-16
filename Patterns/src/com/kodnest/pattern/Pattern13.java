package com.kodnest.pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating scanner object
		System.out.print("Enter the value of n :");
		int n = sc.nextInt(); // read the value of n
		System.out.print("Enter the chrecter to print :");
		char ch = sc.next().charAt(0); // read the character
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i + 1); j++) { // n-i+1 (for reverse)
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) { // k<=i logic=2*i-1
				System.out.print(ch);
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*(n-i)+1; k++) { // k<=i logic=n-(i)+1 here i=2*i-1
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
