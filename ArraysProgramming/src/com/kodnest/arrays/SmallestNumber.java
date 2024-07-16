package com.kodnest.arrays;

public class SmallestNumber {
	
	//Find the smallest number
	public int find(int[] a) {
		int small=a[0];
		for(int x:a) {
			if(x<small) {
				small=x;
			}
		}
		return small;
	}

}
