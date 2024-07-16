package com.kodnest.controlstatement1;

import java.util.Scanner;

public class AdultApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		Adult a=new Adult();
		a.Age(age);
	}
}
