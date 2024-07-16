package com.kodnest.arrays;

public class IdentifyEvenNumbers {
	
	//Counting even numbers in array
	public int even(int[] a) {
		int count=0;
		for(int x:a) {
			if(x%2==0) {
				count++;
			}
		}
		return count;
	}
}
