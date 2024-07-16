package com.kodnest.arrays;

import java.util.Scanner;

public class SumOfArrayApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Enter the length of both the array: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		
		//Store the elements in the array
		System.out.println("Enter the elements to be stored in the first array:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be stored in the second array:");
		for(int i=0;i<=b.length-1;i++) {
			b[i]=sc.nextInt();
		}
		sc.close();
		
		SumOfArrays S=new SumOfArrays();
		c=S.add(a, b);
		
		//Array after adding each elements of arrays a and b integers
		System.out.println("Resulting array:");
		for(int x:c) {
			System.out.print(x+" ");
		}
	}
}
