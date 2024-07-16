package com.kodnest.methods;

import java.util.Scanner;

public class Swapping2 {
	public static void swap(int a, int b) {
		System.out.println("Before swapping, a="+a+", b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, a="+a+", b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		x=sc.nextInt();
		System.out.println("Enter value of b :");
		y=sc.nextInt();
		sc.close();
		swap(x,y);
	}

}