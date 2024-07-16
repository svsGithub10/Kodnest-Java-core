package com.kodnest.arrays.selectionsort;

public class SelectionSort {
	public int[] selectionSorting(int[] a) {
		
		//Sorting using Selection sort
		for(int i=0; i<=a.length-2;i++) {
			int min=a[i];	//Assuming first value as minimum value
			int pos=i;	//Position of minimum value
			
			//Searching for minimum value
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[j]<min) {
					min=a[j];
					pos=j;
				}
			}
			
			//Arranging in sorted position
			int temp;
			temp = a[pos];
			a[pos]=a[i];
			a[i]=temp;
		}
		return a;
	}
}