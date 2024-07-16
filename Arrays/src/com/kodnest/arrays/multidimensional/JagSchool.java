package com.kodnest.arrays.multidimensional;

import java.util.Scanner;

public class JagSchool {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//get the no. of schools
		System.out.print("Enter the no. of schools : ");
		int one=sc.nextInt();
		int[][][] a=new int[one][][];
		System.out.println();
		for(int i=0;i<a.length;i++) {
			//get the no. of classes in each school
			System.out.print("Enter the no. of classes in school "+(i+1)+" : ");
			int two=sc.nextInt();
			a[i] =new int[two][];
			System.out.println();
			for(int j=0;j<a[i].length;j++) {
				//get the no. of students in each class of each school
				System.out.print("Enter the no. of students in School "+(i+1)+" Class "+(j+1)+" : ");
				int three=sc.nextInt();
				a[i][j] =new int[three];
			}
			System.out.println();
		}
		//get the marks of each student in each class in0 each school
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print("Enter the marks of School "+(i+1)+" Class "+(j+1)+" Student "+(k+1)+" : ");
					a[i][j][k]=sc.nextInt();
				}
				System.out.println();
			}
//			System.out.println();
		}
		System.out.println();
		sc.close();
		//print the marks of every student
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Marks of School "+(i+1)+" Class "+(j+1)+" Student "+(k+1)+" : "+a[i][j][k]);
				}
				System.out.println();
			}
//			System.out.println();
		}
		System.out.println();
	}

}
