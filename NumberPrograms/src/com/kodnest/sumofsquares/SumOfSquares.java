package com.kodnest.sumofsquares;

public class SumOfSquares {
	//logic to calculate sum of squares from 1 to n numbers
	public void result(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(i*i);
		}
		System.out.println("Sum of squares from 1 to "+n+" numbers = "+sum);
	}
}
