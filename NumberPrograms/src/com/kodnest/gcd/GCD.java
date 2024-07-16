package com.kodnest.gcd;

public class GCD {
	//logic to find GCD of two numbers
	public void result(int a, int b) {
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;;
			}
		}
		System.out.println("GCD of "+a+" & "+b+" = "+gcd);
	}
}
