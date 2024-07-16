package com.kodnest.fibonacci;

public class Fibonacci {
	// logic to print the fibonacci series up to n
	public void display(int n) {
		int fib1=0,fib2=1,nextNum;
		System.out.print("First "+n+" Fibonacci series : ");
		if(n==1) {
			System.out.println(fib1);
		}
		else if(n==2) {
			System.out.println(fib1+" "+fib2);
		}
		else {
			System.out.print(fib1+" "+fib2);
			for(int i=2;i<n;i++) {
				nextNum=fib1+fib2;
				System.out.print(" "+nextNum);
				fib1=fib2;
				fib2=nextNum;
			}
		}
	}
}
