package com.kodnest.controlstatement3;
//non static class
public class EvenN {
	void Even(int n) { //method to print all possible even numbers
		for(int i=1;i<=n;i++) {	//checking and printing the n even numbers
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
