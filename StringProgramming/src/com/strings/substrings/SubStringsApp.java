package com.strings.substrings;

import java.util.Scanner;

public class SubStringsApp {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//Take user input
		System.out.print("Enter first string: ");
		String s=sc.nextLine();
		sc.close();
		
		//print all substrings
		SubStrings.subStrings(s);
	
	}

}
