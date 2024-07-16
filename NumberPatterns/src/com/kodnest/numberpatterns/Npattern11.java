package com.kodnest.numberpatterns;

import java.util.Scanner;

public class Npattern11 {

	public static void main(String[] args) {	//main method
		int count=1; 	//to count the numbers
		Scanner sc=new Scanner(System.in);	//scanner object
		System.out.print("Enter the even value of n :");
		int n=sc.nextInt();	//get the user value
		for(int i=1;i<=n;i++) {	//no of rows
			for(int j=1;j<=2*n;j++) {	//no of columns
				if(count%2!=0) {	//for odd numbers
				if(count/10==0) System.out.print("0"+count+"\t");	//if count is single digit,then concatenating it with 0
				else System.out.print(count+"\t");	//when count is double digit print as it is
				}
				count++;	//getting the count number
			}
			System.out.println();
		}

	}

}
