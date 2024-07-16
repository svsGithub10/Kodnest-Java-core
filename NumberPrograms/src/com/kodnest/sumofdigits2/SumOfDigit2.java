package com.kodnest.sumofdigits2;

public class SumOfDigit2 {
	// Logic to calculate the sum of digits of a number
	public void calculate(long n) {
		long digit, sum = 99;
		long real;
		real = n;
		while (sum/10 != 0) {
			sum=0;
			while (n > 0) {
				digit = n % 10;
				sum = sum + digit;
				n = n / 10;
			}
			n=sum;
			System.out.println("Sum of digits of number " + real + " = " + sum);
			real=n;
		}
	}

}
