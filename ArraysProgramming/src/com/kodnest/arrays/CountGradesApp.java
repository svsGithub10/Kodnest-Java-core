package com.kodnest.arrays;

import java.util.Scanner;

public class CountGradesApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Declare an array ranging 0 to 100
		int[] a=new int[100];
		
		//Get the length of array by user
		System.out.print("Enter the number of students: ");
		int n=sc.nextInt();
		
		//Store the elements in the array
		System.out.println("Enter the scores of each students:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		CountGrades C=new CountGrades();
		
		//Print the result
		System.out.println("Number of students who have scored greater than 75 = "+C.calculate(a));
	}
}
