package com.arrays.reverse;

import java.util.Scanner;

public class ReverseApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		Reverse R=new Reverse();
		System.out.println("Reversed string: "+R.reverse(S));
	}

}
