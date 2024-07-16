package com.strings.concatsamelength;

import java.util.Scanner;

public class ConcatSameLengthApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the strings from user
		System.out.print("Enter the first string: ");
		String s1=sc.nextLine();
		System.out.print("Enter the second string: ");
		String s2=sc.nextLine();
		sc.close();
		
		//Get the result
		ConcatSameLength C=new ConcatSameLength();
		System.out.println(C.compare(s1, s2));
	}

}
