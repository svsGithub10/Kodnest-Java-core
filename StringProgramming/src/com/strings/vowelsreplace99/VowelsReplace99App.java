package com.strings.vowelsreplace99;

import java.util.Scanner;

public class VowelsReplace99App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
		sc.close();
		
		System.out.println("After replacement: "+VowelsReplace99.replace(s));

	}

}
