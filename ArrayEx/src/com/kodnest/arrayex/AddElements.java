package com.kodnest.arrayex;

import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arrays : ");
		int n = sc.nextInt(); // no.of elements in the array
		//		System.out.print("Enter the size of array b[] : ");
		//		int m = sc.nextInt(); // no.of elements in the array
		int[] a = new int[n]; // declaring array
		int[] b = new int[n]; // declaring array
		System.out.print("Enter the elements of array a[] : ");
		for (int i = 0; i < n; i++) {
			// get the elements
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the elements of array b[] : ");
		for (int i = 0; i < n; i++) {
			// get the elements
			b[i] = sc.nextInt();
		}
		System.out.println();
		sc.close();
		add(a, b, n);

	}
	public static void add(int a[], int b[], int n) {
		int[] c=new int[n];
		for(int i=0;i<n;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println("Added successfully and assigned to c[]!");
		System.out.print("\nElements of c[] are : ");
		for(int i=0;i<n;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
