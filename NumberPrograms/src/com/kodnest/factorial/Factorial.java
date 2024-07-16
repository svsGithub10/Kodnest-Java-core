package com.kodnest.factorial;

public class Factorial {
	public void calculate(int n) {
		long res=1;
		//logic to print the factorial of n
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		System.out.println(n+"! = "+res);
	}

}
