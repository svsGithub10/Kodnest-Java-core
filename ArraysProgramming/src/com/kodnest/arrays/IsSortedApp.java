package com.kodnest.arrays;

import java.util.Scanner;

public class IsSortedApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Enter the size of array: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Store the elements in array:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		//Invoking the method
		IsSorted I=new IsSorted();
		System.out.println(I.isSorted(a));
	}

}
