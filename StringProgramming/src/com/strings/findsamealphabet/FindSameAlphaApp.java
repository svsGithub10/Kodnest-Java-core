package com.strings.findsamealphabet;

import java.util.Scanner;

public class FindSameAlphaApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String s1=sc.nextLine();
		System.out.print("Enter Second name: ");
		String s2=sc.nextLine();
		sc.close();
		
		System.out.println("Common alphabets present in both strings: "+FindSameAlpha.findSameAlpha(s1, s2));
	}

}
