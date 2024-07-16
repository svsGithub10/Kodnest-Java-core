package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row=sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("Enter the elements of matrix "+row+" x "+col+" :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
//			System.out.println();
		}
		sc.close();
		System.out.println("Entered matrix is :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
//				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
//			System.out.println();
		}
	}

}
