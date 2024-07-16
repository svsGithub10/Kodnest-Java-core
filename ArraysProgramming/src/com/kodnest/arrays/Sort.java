package com.kodnest.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

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
		sc.close();
		
		//Print Sorted array
		System.out.println("Array after sorting :");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		//Sort using inbuilt method
		Arrays.sort(a);
		
		//Print Sorted array
		System.out.println("Array after sorting :");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
