package com.kodnest.arrays;

public class NegativeToZero {
	
	//Logic to replace negative integer numbers
	public int[] replace(int[] a) {
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<0) {
				a[i]=0;
			}
		}
		return a;
	}

}
