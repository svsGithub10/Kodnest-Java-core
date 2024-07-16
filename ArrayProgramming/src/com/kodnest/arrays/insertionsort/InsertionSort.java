package com.kodnest.arrays.insertionsort;

public class InsertionSort {
	public int[] insertionSorting(int[] a) {
		
		//Sorting using insertion sort
		for(int i=1;i<=a.length-1;i++) {
			int element=a[i];
			int j=i-1;
			while((j>=0) && a[j]>element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=element;
		}
		return a;
	}
}
