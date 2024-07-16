package com.kodnest.arrays;

import java.util.Scanner;

public class PrintArrayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//creating an array having the size given by user
		System.out.print("Enter the length of array: ");
		int[] a=new int[sc.nextInt()];
		
		//storing the elements given by user
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		//creating class object
		PrintArray P=new PrintArray();
		
		//calling the PrintArray class method to print the required output
		P.printArray(a);
	}

}
