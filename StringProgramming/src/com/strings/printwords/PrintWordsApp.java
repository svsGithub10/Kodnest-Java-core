package com.strings.printwords;

import java.util.Scanner;

public class PrintWordsApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the user sentence
		System.out.println("Enter the sentance: ");
		String s=sc.nextLine();
		
		//Calling the method which gives the result
		PrintWords.printWords(s);
		sc.close();
	}

}
