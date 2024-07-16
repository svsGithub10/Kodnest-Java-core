package com.kodnest.arrays.twodimensionalarrays;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of companies : ");
		int row=sc.nextInt();
		System.out.print("Enter the number of employees in each company : ");
		int col=sc.nextInt();
		String[][] a=new String[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter company "+(i+1)+" employee "+(j+1)+" name : ");
				a[i][j]=sc.next();
			}
		}
		sc.close();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Company "+(i+1)+" employee "+(j+1)+" name : "+a[i][j]);
			}
		}
	}

}
