package com.methods.loops;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		while(a>1) {
			a=a/2;
			System.out.print(a+" ");
		}
	}
}
