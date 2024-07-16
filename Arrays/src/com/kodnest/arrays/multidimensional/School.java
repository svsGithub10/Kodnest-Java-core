package com.kodnest.arrays.multidimensional;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][][] a=new int[2][3][5];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print("Enter the marks of School "+(i+1)+" Class "+(j+1)+" Student "+(k+1)+" = ");
					a[i][j][k]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println();
			sc.close();
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print("Marks of School "+(i+1)+" Class "+(j+1)+" Student "+(k+1)+" = "+a[i][j][k]);
				}
				System.out.println();
			}
//			System.out.println();
		}
		System.out.println();
	}

}
