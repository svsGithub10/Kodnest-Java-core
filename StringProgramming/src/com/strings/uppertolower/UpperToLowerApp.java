package com.strings.uppertolower;

import java.util.Scanner;

public class UpperToLowerApp {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			//Get the string from user
			System.out.print("Enter the string: ");
			String S=sc.nextLine();
			sc.close();
			
			//Get the result
			UpperToLower U=new UpperToLower();
			System.out.println(U.convert(S));
		}

	}


