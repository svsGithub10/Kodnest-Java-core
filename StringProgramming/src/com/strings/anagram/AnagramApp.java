package com.strings.anagram;

import java.util.Scanner;

public class AnagramApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Take user input
		System.out.print("Enter first string: ");
		String s1=sc.nextLine();
		System.out.print("Enter second string: ");
		String s2=sc.nextLine();
		sc.close();
		
		//check for anagram
		System.out.println(Anagram.checkAnagram(s1, s2));
	}

}
