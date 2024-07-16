package com.kodnest.prime;

public class Prime {
	//Logic to print n prime numbers
	public void display(int n) {
		System.out.print("Prime numbers from 1 to "+n+" are :");
		for(int i=1;i<=n;i++) {	
			int flag=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					flag++;
				}
			}
			if(flag==1)
			System.out.print(" "+i);
		}
	}
}
