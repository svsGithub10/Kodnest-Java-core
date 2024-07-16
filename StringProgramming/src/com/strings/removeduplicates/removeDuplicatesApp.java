package com.strings.removeduplicates;

import java.util.Scanner;

public class removeDuplicatesApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		RemoveDuplicates P=new RemoveDuplicates();
		System.out.println(P.printRes(S));
	}

}
