package com.kodnest.arrays;

import java.util.Scanner;

public class NegativeToZeroApp {
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
		
		//Array before replacing negative integers
		System.out.println("Array before raplacing negative integer elemnts:");
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		NegativeToZero N=new NegativeToZero();
		a=N.replace(a);
		
		//Array after replacing negative integers
		System.out.println("\nArray after raplacing negative integer elemnts:");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
}
