package com.kodnest.methods3;

public class GCD {
	void calculate(int a, int b) {
		int res=1;
		for(int i=1;i<a && i<b;i++) {
			if(a%i==0 && b%i==0) {
				res=i;
			}

		}
		System.out.println("GCD of "+a+" and "+b+" = "+res);
	}
}
