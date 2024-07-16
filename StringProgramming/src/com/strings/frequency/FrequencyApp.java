package com.strings.frequency;

import java.util.Scanner;

public class FrequencyApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the string from user
		System.out.print("Enter the string: ");
		String S=sc.nextLine();
		sc.close();
		
		//Get the result
		Frequency F=new Frequency();
		F.checkFrequency(S);
	}

}
