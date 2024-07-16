package com.arrays.evenodd;

import java.util.Scanner;

public class EvenandOdd {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter array size: ");
	int [] a=new int[sc.nextInt()];
	for(int i=0;i<=a.length-1;i++) a[i]=sc.nextInt();
	EvensAndOdds(a);
	}
	public static void EvensAndOdds(int a[]) {
		int evenLen=0,oddLen=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) evenLen++;
			else oddLen++;
		}
		int el=0,ol=0;
		int [] even=new int[evenLen];
		int [] odd=new int[oddLen];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				even[el]=a[i];
				el++;
			}
			else {
				odd[ol]=a[i];
				ol++;
			}
		}
		System.out.println("Even array elements: ");
		for(int x:even) {
			System.out.print(x+" ");
		}
		System.out.println("\nOdd array elements: ");
		for(int x:odd) {
			System.out.print(x+" ");
		}
	}
}
