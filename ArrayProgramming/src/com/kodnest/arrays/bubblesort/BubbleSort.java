package com.kodnest.arrays.bubblesort;

public class BubbleSort {
	public int[] bubbleSorting(int[] a) {
		int temp;
		
		//Sorting using Bubble sort Algorithm
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-i-2;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

}
