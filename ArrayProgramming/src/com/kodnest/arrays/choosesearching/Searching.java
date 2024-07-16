package com.kodnest.arrays.choosesearching;

import java.util.Scanner;

public class Searching {

	//Performing linear search
	public static void linearSearch(int[] a,int key) {
		int n = a.length,pos=-1;
		for(int i=0;i<n;i++) {
			if(key==a[i]) {
				pos=i;
				break;
			}
		}
		if(pos>=0) System.out.println("Element "+key+" found at position "+pos+".");
		else System.out.println("Element "+key+" not found.");
	}

	//To perform binary search
	public static void binarySearch(int[] a,int key) {

		//Check for sorted order
		if(isSorted(a)==false) {
			System.out.println("Enter the array in sorted order.");
		}

		else {
			//Performing binary search
			int low=0;
			int high=a.length;
			int mid=(low+high)/2;
			int pos=-1;
			while(high>=low) {
				if(key==a[mid]) {
					pos=mid;
					break;
				}
				else if(key>a[mid]) {
					low=mid+1;
					mid=(low+high)/2;
				}
				else {
					high=mid-1;
					mid=(low+high)/2;
				}
			}
			if(pos>=0) System.out.println("Element "+key+" found at position "+pos+".");
			else System.out.println("Element "+key+" not found.");
		}
	}

	//Checking for sorted order
	public static boolean isSorted(int[] a) {
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-i-2;j++) {
				if(a[j+1]<a[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//Make options
		System.out.println("Press 1 to perform Linear Search.");
		System.out.println("Press 2 to perform Binary Search.");
		int op=sc.nextInt();

		//Get the length of array by user
		System.out.print("Enter the size of array: ");
		int[] a=new int[sc.nextInt()];

		//Store the elements in the array
		System.out.println("Store the elements in array:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}

		//Get the key element to be searched
		System.out.print("Enter the element to be search: ");
		int key=sc.nextInt();

		//Invoking the method according to option
		
		//Using ifelseif
		/*if(op==1) {
			linearSearch(a, key);
		}
		else if(op==2) {
			binarySearch(a, key);
		}
		else {
			System.out.println("Invalid option.");
		}*/

		//Using switch
		switch(op) {
		case 1:	linearSearch(a, key);
		break;
		case 2: binarySearch(a, key);
		break;
		default:
			System.out.println("Invalid option.");
		}
		sc.close();
	}
}
