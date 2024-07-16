package com.strings.samelength;

import java.util.Scanner;

public class SameLengthApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the strings from user
		System.out.print("Enter the first string: ");
		String s1=sc.nextLine();
		System.out.print("Enter the second string: ");
		String s2=sc.nextLine();
		sc.close();
		
		//Comparing the length
		SameLength S=new SameLength();
		S.compare(s1, s2);
	}

}
