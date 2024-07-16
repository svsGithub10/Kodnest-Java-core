package com.kodnest.sumofdigits;

public class SumOfDigit {
	//Logic to calculate the sum of digits of a number
	public void calculate(long n) {
		long digit,sum=0;
		long real;
		real=n;
		while(n>0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum of digits of number "+real+" = "+sum);
	}

}
