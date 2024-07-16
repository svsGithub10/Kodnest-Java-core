package com.kodnest.evennumbers;

public class EvenNumbers {
	public void display(int n) {	//Method to display the result
		System.out.println("Even numbers between 1 to "+n+ ": ");
		//logic to print n even numbers
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
