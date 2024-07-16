package com.kodnest.arrays.choosesorting;

import java.util.Scanner;

public class Sort {
	
	//Sorting array in Ascending order using bubble sort
	public static int[] bubbleSortAsc(int a[]) {
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-i-2;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	//Sorting array in Ascending order using selection sort
	public static int[] selectionSortAsc(int[] a) {
		
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
	
	//Sorting array in Ascending order using insertion sort
	public static int[] insertionSortAsc(int[] a) {
		
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
	
	//Sorting array in Descending order using bubble sort
	public static int[] bubbleSortDesc(int a[]) {
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-i-2;j++) {
				if(a[j+1]>a[j]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	//Sorting array in Ascending order using selection sort
	public static int[] selectionSortDesc(int[] a) {
		
		//Sorting using Selection sort
		for(int i=0; i<=a.length-2;i++) {
			int max=a[i];	//Assuming first value as minimum value
			int pos=i;	//Position of minimum value
			
			//Searching for minimum value
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[j]>max) {
					max=a[j];
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
	
	//Sorting array in Ascending order using insertion sort
	public static int[] insertionSortDesc(int[] a) {
		
		//Sorting using insertion sort
		for(int i=1;i<=a.length-1;i++) {
			int element=a[i];
			int j=i-1;
			while((j>=0) && a[j]<element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=element;
		}
		return a;
	}
	
	//Main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get Array size and creating the array
		System.out.print("Enter the size of array: ");
		int [] a=new int[sc.nextInt()];
		
		//Storing the elements
		System.out.println("Enter the elements to be stored:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		
		//Before sorting
		System.out.println("\nBefore sorting :");
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		//Choose the sorting method
		System.out.println("\n\nChoose an option:\n"
				+ "Press 1 to perform bubble sort in ascending order\r\n"
				+ "Press 2 to perform selection sort in ascending order\r\n"
				+ "Press 3 to perform insertion sort in ascending order\r\n"
				+ "Press 4 to perform bubble sort in descending order\r\n"
				+ "Press 5 to perform selection sort in descending order\r\n"
				+ "Press 6 to perform insertion sort in descending order");
		int op=sc.nextInt();
		
		//Invoking the correct option using switch
		switch(op) {
		case 1: bubbleSortAsc(a);
		break;
		case 2: selectionSortAsc(a);
		break;
		case 3: insertionSortAsc(a);
		break;
		case 4: bubbleSortDesc(a);
		break;
		case 5: selectionSortDesc(a);
		break;
		case 6: insertionSortDesc(a);
		break;
		default: System.out.println("Enter the valid option.");
		System.exit(0);
		}
		
		//After sorting
		System.out.println("\nAfter sorting :");
		for(int x:a) {
			System.out.print(x+" ");
		}
		sc.close();
	}

}
