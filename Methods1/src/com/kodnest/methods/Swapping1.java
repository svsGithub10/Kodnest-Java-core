package com.kodnest.methods;

import java.util.Scanner;

public class Swapping1 {
	public static void swap(int a, int b) {
		int temp;
		System.out.println("Before swapping : a="+a+", b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : a="+a+", b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int x=sc.nextInt();
		System.out.println("Enter value of b :");
		int y=sc.nextInt();
		sc.close();
		swap(x,y);
	}

}
