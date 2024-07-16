package com.methods.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b = a;
		do {
			b=b*(a-1);
			a--;
		}while(a>1);
		System.out.println(b);
	}

}
