package com.kodnest.arrays.selectionsort;

import java.util.Scanner;

public class SelectionSortApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SelectionSort S=new SelectionSort();
		
		//Get the length of array by user
		System.out.print("Enter the length of the array: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Enter the elements to be stored in the array:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		//Array before sorting
		System.out.println("Array before sorting:");
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		//invoking bubble sort method
		S.selectionSorting(a);
		
		//Array after sorting
		System.out.println("\nArray after sorting:");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
}
