package com.kodnest.arrays.linearsearch;

import java.util.Scanner;

public class LinearSearchApp {

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
		
		//Get the key value to be searched in the array
		System.out.println("Enter the key value to be searched: ");
		int key=sc.nextInt();
		sc.close();
		
		//invoking the linear search method
		//LinearSearch L=new LinearSearch();
		System.out.println(LinearSearch.linearSearch(a,key));
	}

}
