package com.kodnest.arrays;

import java.util.Scanner;

public class SumOfPositiveApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Emma, enter the number of transactions: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Emma, please enter each transaction amount:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		SumOfPositive P=new SumOfPositive();
		
		//Print the result
		System.out.println("Emma, sum of positive amounts: "+P.result(a));
	}

}
