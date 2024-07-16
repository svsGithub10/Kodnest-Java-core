package com.kodnest.sumofnaturalnumbers;

public class NaturalNumbersSum {	
	public void sumOfSeries(int n) {	//Method to print result
		//logic to calculate the sum of first n natural numbers
		int sum=0;		//Initializing a variable to store the result
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of first "+n+" natural numbers = "+sum); 	//print the result
	}
}
