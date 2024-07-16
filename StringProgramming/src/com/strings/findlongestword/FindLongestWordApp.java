package com.strings.findlongestword;

import java.util.Scanner;

public class FindLongestWordApp {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		FindLongestWord F=new FindLongestWord();
		System.out.println("longest word: "+F.findLongestWord(S));
	
	}

}
