package com.kodnest.arrayex;

import java.util.Scanner;

public class FindingElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();	//no.of elements in the array
		int[] a=new int[n];	//declaring array
		for(int i=0;i<n;i++) {
			//get the elements
			System.out.print("Enter the elements of array in position "+(i+1)+" = ");
			a[i]=sc.nextInt();
		}
		System.out.println();
		//calculating the result
		System.out.print("Enter the element to search : ");
		int find=sc.nextInt();
		sc.close();
		find(n,a,find);
	}
	public static void find(int n,int a[],int f) {
		//logic to get sum of all elements
		int flag=0;
		for(int i=0;i<n;i++) {
			if(a[i]==f) {
				System.out.println("The element "+f+" is present in positin "+(i+1));
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("The element "+f+" not found.");
		}
	}
}
