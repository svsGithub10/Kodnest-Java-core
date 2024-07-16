package com.kodnest.arrays.twodimensionalarrays;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of classes : ");
		int row=sc.nextInt();
		System.out.print("Enter the number of students in each class : ");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter class "+(i+1)+" student "+(j+1)+" marks : ");
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Class "+(i+1)+" student "+(j+1)+" marks : "+a[i][j]);
			}
		}
	}

}
