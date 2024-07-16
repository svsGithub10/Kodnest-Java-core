package com.kodnest.arrays;

import java.util.Scanner;

public class PositiveElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//creating an array having the size given by user
		System.out.print("Enter the length of array: ");
		int[] a=new int[sc.nextInt()];
		
		//storing the elements
		System.out.println("Enter "+a.length+" numbers to be stored:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}	
		sc.close();
		
		//displaying the positive elements of array
		System.out.println("The positive numbers stored in array are:");
		/*for(int i=0; i<=a.length-1;i++) {
			if(a[i]>0) System.out.print(a[i]+" ");
		}*/
		//using for-each loop
		for(int x:a) {
			if(x>0) System.out.print(x+" ");
		}
	}

}