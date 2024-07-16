package com.kodnest.methods3;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GCD G=new GCD();
		System.out.println("Enter 2 numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		G.calculate(a, b);
	}

}
