package com.kodnest.controlstatement1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}

}
