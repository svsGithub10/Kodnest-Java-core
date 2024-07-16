package com.kodnest.arrayex;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();	//no.of elements to be added
		int[] a=new int[n];	//declaring array
		for(int i=0;i<n;i++) {
			//get the elements
			System.out.print("Enter the elements of array in position "+(i+1)+" = ");
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();
		//calculating the result
		sum(n,a);
	}
	public static void sum(int n,int a[]) {
		//logic to get sum of all elements
		int res=0;
		for(int i=0;i<n;i++) {
			res=res+a[i];
		}
		System.out.println("Sum of all elements = "+res);
	}
}
