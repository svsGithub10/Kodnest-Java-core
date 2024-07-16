package com.kodnest.arrays;

public class FindPrime {
	public void primes(int[] a) {
		System.out.print("\nHannah! Prime numbers present in the list are: ");
		for(int x:a) {
			int count=0;
			for(int i=1;i<=x;i++) {
				if(x%i==0) count++;
			}
			if(count==2) {
				System.out.print(x+" ");
			}
		}
	}
}
