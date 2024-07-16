package com.kodnest.arrays.onedimensionalarrays;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number Employee : ");
		int n=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++) {
				System.out.print("Enter the name of employee "+(i+1)+" : ");
				a[i]=sc.next();
		}
		sc.close();
		System.out.println();
		for(int i=0;i<n;i++) {
				System.out.println("Employee "+(i+1)+" name : "+a[i]);
		}
	}

}
