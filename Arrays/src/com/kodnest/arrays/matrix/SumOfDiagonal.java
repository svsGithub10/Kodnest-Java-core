package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class SumOfDiagonal {

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
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) sum1=sum1+a[i][j];
				if((i+j)==a.length-1) sum2 += a[i][j];
			}
		
//			System.out.println();
		}
		System.out.println("Sum of 1st diagonal = "+sum1);
		System.out.println("Sum of 2nd diagonal = "+sum2);
		
	}

}
