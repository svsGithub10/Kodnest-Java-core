package com.kodnest.arrays;

import java.util.Scanner;

public class IdentifyEvenNumbersApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Bob, how many numbers you have?: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Bob, please enter the numbers:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		IdentifyEvenNumbers I=new IdentifyEvenNumbers();
		
		//Print the result
		System.out.println("Bob, there are "+I.even(a)+" even numbers.");
	}

}
