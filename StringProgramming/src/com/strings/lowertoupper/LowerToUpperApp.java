package com.strings.lowertoupper;

import java.util.Scanner;

public class LowerToUpperApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		LowerToUpper L=new LowerToUpper();
		System.out.println(L.convert(S));
	}
}
