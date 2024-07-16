package com.kodnest.arrays.binarysearch;

public class BinarySearch {
	public void binarySearch(int a[], int key) {
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		while(high>=low) {
			if(key==a[mid]) {
				System.out.println("Key "+key+" is present at: "+mid );
				return ;
			}
			else if(key>a[mid]) {
				high=mid+1;
				mid=(low+high)/2;
			}
			else {
				low=mid-1;
				mid=(low+high)/2;
			}
		}
		System.out.println("Key "+key+" not found.");
	}
}
