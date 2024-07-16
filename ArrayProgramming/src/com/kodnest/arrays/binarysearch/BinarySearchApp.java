package com.kodnest.arrays.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Enter the length of the array: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Enter the elements to be stored in the array:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		//Print Sorted array
		System.out.println("Array after sorting :");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		//Get the key value to be searched in the array
		System.out.println("\nEnter the key value to be searched: ");
		int key=sc.nextInt();
		sc.close();
		
		//invoking the binary search method
		BinarySearch B=new BinarySearch();
		B.binarySearch(a, key);

	}

}
