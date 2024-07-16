package com.kodnest.methods3;

public class EvenN {
	void even(int n) {
		System.out.println("Even numbers: ");
		for(int i=1;i<=n;i++) {	//applying the range from 1 to n
			if(i%2==0) {	//check for even number
				System.out.print(i+" ");
			}
		}
	}
}
