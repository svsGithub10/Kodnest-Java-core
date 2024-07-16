package com.kodnest.arrays;

import java.util.Scanner;

public class SmallestNumberApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the length of array by user
		System.out.print("Alice, how many numbers do want to enter?: ");
		int[] a=new int[sc.nextInt()];
		
		//Store the elements in the array
		System.out.println("Alice, please enter the numbers:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		SmallestNumber S=new SmallestNumber();
		
		//Print the result
		System.out.println("Alice, smallest number you entered is: "+S.find(a));
	}

}
