package com.kodnest.methods3;

public class SumOfDigits {
	int a;
	void evaluate(long a) {
//		int count=1;
		long digit=0,sum=0; //initialize sum and digit variable
		while(a>0) {
			digit=a%10;	//getting the last digit
			sum=sum+digit;	//adding the digits
			a=a/10;	//breaking the last digit
		}
		System.out.println("Sum of digits = "+sum); //printing the result
	}
}
