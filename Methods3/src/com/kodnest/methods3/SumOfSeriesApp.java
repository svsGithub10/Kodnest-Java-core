package com.kodnest.methods3;

import java.util.Scanner;

public class SumOfSeriesApp {

	public static void main(String[] args) {	//main
		Scanner sc=new Scanner(System.in);	//scanner object
		SumOfSeries S=new SumOfSeries();	//class object
		System.out.print("Enter the number : ");
		int n=sc.nextInt();	//scanning the user value
		S.series(n); 	//calling series() method
	}

}
