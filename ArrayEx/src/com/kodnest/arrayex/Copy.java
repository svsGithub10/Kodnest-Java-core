package com.kodnest.arrayex;

import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array a[] : ");
		int n=sc.nextInt();	//no.of elements in the array
		int[] a=new int[n];	//declaring array
		System.out.print("Enter the elements of array a[] : ");
		for(int i=0;i<n;i++) {
			//get the elements
			a[i]=sc.nextInt();
		}
		System.out.println();
		sc.close();
		copy(n,a);
	}
	public static void copy(int n,int a[]) {
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=a[i];
		}
		System.out.println("Elements of array a[] are copied to array b[]!");
		System.out.print("\nElemets of array b[] are : ");
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
