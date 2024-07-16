package com.strings.countcase;

import java.util.Scanner;

public class CountCaseApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		CountCase C=new CountCase();
		C.count(S);
	}

}
