package com.kodnest.arrays;

import java.util.Scanner;

public class SwappingIndexValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//creating an array having the size given by user
		System.out.print("Enter the length of array: ");
		int[] a=new int[sc.nextInt()];
		
		//storing the elements
		System.out.println("Enter "+a.length+" numbers to be stored:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}	
		
		//asking the indexes of the values to be swapped
		System.out.print("Enter the two indexes of values to be swapped: ");
		int pos1=sc.nextInt();
		int pos2=sc.nextInt();		
		
		//displaying the elements of array before swapping
		System.out.println("The numbers stored in array before swapping are:");
		System.out.print("Arr--> ");
		/*for(int i=0; i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}*/
		//using for-each loop
		for(int x:a) {
			System.out.print(x+" ");
		}
		sc.close();
		
		//swapping the values using temp variable
		int temp=0;
		temp=a[pos1];
		a[pos1]=a[pos2];
		a[pos2]=temp;
		
		//displaying the elements of array after swapping
		System.out.println("\nThe numbers stored in array after swapping are:");
		System.out.print("Arr--> ");
		/*for(int i=0; i<=a.length-1;i++) {z
			System.out.print(a[i]+" ");
		}*/
		//using for-each loop
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}