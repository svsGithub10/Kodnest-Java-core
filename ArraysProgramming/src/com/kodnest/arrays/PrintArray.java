package com.kodnest.arrays;

public class PrintArray {
	//creating a method to print array
	public void printArray(int a[]) {
		
		//printing the original array elements
		System.out.println("Array before reversing:");
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		//printing the array elements in reverse
		System.out.println("\nArray after reversing:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
