package com.kodnest.controlstatement1;

import java.util.Scanner;

public class CapitalLetterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CapitalLetter C=new CapitalLetter();
		System.out.println("Enter a Letter :");
		char c=sc.next().charAt(0);
		C.Letter(c);

	}

}
