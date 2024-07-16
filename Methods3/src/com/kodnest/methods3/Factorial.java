package com.kodnest.methods3;

public class Factorial {
	void fact(int a) {
		long res=1; //initializing a variable for result
		for(int i=a;i>=1;i--) {	//loop from a to 1
			res=res*i;	//generating the result
		}
		System.out.println(a+"! = "+res);	//printing the result
	}
}
