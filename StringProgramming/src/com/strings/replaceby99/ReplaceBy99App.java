package com.strings.replaceby99;

import java.util.Scanner;

public class ReplaceBy99App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		ReplaceBy99 R=new ReplaceBy99();
		System.out.println(R.replaceSpace(S));
	}

}
