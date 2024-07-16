package com.kodnest.methods3;

public class Fibonacci {
	int n;
	void series(int n) {
		int a=0,b=1,c;	//initialize first 2 numbers of series
		if(n==1) {	//if n=1
			System.out.println(a);
		}
		else if(n==2){	//if n=2
		System.out.print(a+" "+b+" ");
		}
		else {	//if n>2
			System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++) {
//			b=a+b;	//calculate next possible number in series
//			System.out.print(b+" ");
//			a=b-a;	//previous value in series
//			or
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		}
	}
}
