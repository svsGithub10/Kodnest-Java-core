package com.kodnest.controlstatement1;

import java.util.Scanner;

class Program2_1 {
	void number(int a) {
		if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}
}
 class Program2_1App{
	 public static void main(String[] args) {
		int a;
		Program2_1 p=new Program2_1();
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		p.number(a);
	}
 }
