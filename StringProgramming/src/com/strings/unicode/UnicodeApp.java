package com.strings.unicode;

import java.util.Scanner;

public class UnicodeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the unicodes
		Unicode U=new Unicode();
		U.printValue(S);
	}

}
