package com.kodnest.arrays;

public class IsSorted {
	
	//Checking for sorted order
	public String isSorted(int[] a) {
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-i-2;j++) {
				if(a[j+1]<a[j]) {
					return "Array is not in sorted order";
				}
			}
		}
		return "Array is in sorted order";
	}
}
