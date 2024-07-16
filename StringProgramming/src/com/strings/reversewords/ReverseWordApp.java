package com.strings.reversewords;

import java.util.Scanner;

public class ReverseWordApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		ReverseWords R=new ReverseWords();
		System.out.println("Resultant String: "+R.reverseWords(S));
//		R.reverseWords(S);
	}
}
