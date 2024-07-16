package com.kodnest.methods3;

public class Prime {
	void getPrime(int n) {
		System.out.print("Prime numbers : ");
		for(int i=2;i<=n;i++) {
			int count=0;	//Initializing a variable to count the number of divisible numbers
			for(int j=2;j<=i;j++) {
				if(i%j==0) {	
					count++;	//if j is divisible by i then increment the count
				}
			}
			if(count==1) {	//checking the count value which must be 1 that is divisible by itself only where it skips dividing by 1
				System.out.print(i+" ");	//printing the result
			}
		}
	}
}
