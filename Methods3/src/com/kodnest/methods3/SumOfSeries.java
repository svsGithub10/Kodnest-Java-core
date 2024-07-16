package com.kodnest.methods3;

public class SumOfSeries {
	void series(int n) {
		long sum=0;	//initiating the sum variable for result
		for(int i=1;i<=n;i++) {
			sum=sum+i;	//adding up the values
		}
		System.out.println("Sum of series = "+sum); //printing the result
	}
}
