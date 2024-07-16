package com.kodnest.arrays;

import java.util.Scanner;

public class FindPrimeApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Hannah, How many numbers you have in the list?: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Enter the numbers:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		FindPrime F=new FindPrime();
		
		//Print the result
		F.primes(a);
	}

}
