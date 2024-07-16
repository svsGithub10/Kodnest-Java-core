package com.kodnest.arrays.linearsearch;

public class LinearSearch {
	//Using linear search algorithm
	public static String linearSearch(int a[],int key) {
		for(int i=0;i<=a.length-1;i++) {
			if(key==a[i]) {
				return "Key "+key+" is present at index "+i ;
			}
		}
		return "Key "+key+" is not present." ;
	}
}
