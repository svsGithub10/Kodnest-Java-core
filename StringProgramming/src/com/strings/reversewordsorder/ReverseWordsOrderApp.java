package com.strings.reversewordsorder;

import java.util.Scanner;

public class ReverseWordsOrderApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		ReverseWordsOrder R=new ReverseWordsOrder();
		System.out.println("After reversing the order: "+R.reverseWordsOrder(S));
	}

}
