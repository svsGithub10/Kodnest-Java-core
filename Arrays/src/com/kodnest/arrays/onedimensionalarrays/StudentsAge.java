package com.kodnest.arrays.onedimensionalarrays;

import java.util.Scanner;

public class StudentsAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number stundents : ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
				System.out.print("Enter the age of student "+(i+1)+" : ");
				a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();
		for(int i=0;i<n;i++) {
				System.out.println("Student "+(i+1)+" age : "+a[i]);
		}
	}

}
