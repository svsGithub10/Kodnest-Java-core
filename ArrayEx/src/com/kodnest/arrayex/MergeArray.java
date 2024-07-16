package com.kodnest.arrayex;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array a[] : ");
		int n = sc.nextInt(); // no.of elements in the array
		System.out.print("Enter the size of array b[] : ");
		int m = sc.nextInt(); // no.of elements in the array
		int[] a = new int[n]; // declaring array
		int[] b = new int[m]; // declaring array
		System.out.print("Enter the elements of array a[] : ");
		for (int i = 0; i < n; i++) {
			// get the elements
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the elements of array b[] : ");
		for (int i = 0; i < m; i++) {
			// get the elements
			b[i] = sc.nextInt();
		}
		System.out.println();
		sc.close();
		merge(a, b, n, m);
	}

	public static void merge(int a[], int b[], int n, int m) {
		int[] c = new int[n + m];
		for (int i = 0; i < n; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < m; i++) {
			c[i + n] = b[i];
		}
		System.out.println("Elements of array a[] and b[] are merged and assigned to c[]!");
		System.out.print("\nElemets of array c[] are : ");
		for (int i = 0; i < n + m; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
