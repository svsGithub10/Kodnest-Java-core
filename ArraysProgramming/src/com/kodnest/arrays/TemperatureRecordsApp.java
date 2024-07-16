package com.kodnest.arrays;

import java.util.Scanner;

public class TemperatureRecordsApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Declare an array ranging 0 to 100
		double[] a=new double[7];
		
		//Get the length of array by user
//		System.out.print("Enter the number of students: ");
//		int n=sc.nextInt();
		
		//Store the elements in the array
		System.out.println("Enter the daily temperatures of the week:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextDouble();
		}
		sc.close();
		
		TemperatureRecords T=new TemperatureRecords();
		
		//Print the result
		System.out.println("Average of temperature of the week = "+T.avg(a));
	}
}
