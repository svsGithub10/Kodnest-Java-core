package com.strings.uppertolowerandlowertoupper;

import java.util.Scanner;

public class UpperToLowerAndLowerToUpperApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		UpperToLowerAndLowerToUpper A=new UpperToLowerAndLowerToUpper();
		System.out.println(A.convert(S));
	}

}
