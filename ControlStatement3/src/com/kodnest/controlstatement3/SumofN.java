package com.kodnest.controlstatement3;
//non static class
public class SumofN {
	int sum=0;
	void series(int n) {	//method to calculate the sum of the series
		for(int i=1;i<=n;i++) {
			sum=sum+i;	//calculate the sum
		}
		System.out.println("Sum ="+sum);
	}
}
