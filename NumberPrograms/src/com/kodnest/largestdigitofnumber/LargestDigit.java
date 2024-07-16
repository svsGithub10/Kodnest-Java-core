package com.kodnest.largestdigitofnumber;

public class LargestDigit {
	//Logic to find largest digit in a number n
	public void find(long n) {
		long digit,large=0,real;
		real=n;
		while(n>0) {
			digit=n%10;
			if(digit>large) large=digit;
			n=n/10;
		}
		System.out.println("Largest digit in "+real+" is : "+large);
	}
}
