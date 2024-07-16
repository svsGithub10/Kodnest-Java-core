package com.kodnest.arrays.jaggedarray;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// getting the number of classes
			System.out.print("Enter the number of classes : ");
			int row = sc.nextInt();
			double[][] arr = new double[row][];
			// getting the number of students in each classes
			for (int i = 0; i < row; i++) {
				System.out.print("Enter the number of students in class " + (i + 1) + " : ");
				int col = sc.nextInt();
				arr[i] = new double[col];
			}
			System.out.println();
			// getting the percentage of each students from each classes
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print("Enter the percentage of Class " + (i + 1) + " Student " + (j + 1) + " : ");
					arr[i][j] = sc.nextDouble();
				}
				System.out.println();
			}
			sc.close();
			System.out.println();
			// printing the result
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Percentage of Class " + (i + 1) + " Student " + (j + 1) + " : " + arr[i][j]);
				}
			}
		}
		
	}

}
