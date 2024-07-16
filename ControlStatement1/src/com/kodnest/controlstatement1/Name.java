package com.kodnest.controlstatement1;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		name=name.toLowerCase();
		switch(name) {
		case "ajay": System.out.println("Ajay lives in Delhi.");
		break;
		case "ankit": System.out.println("Ankit lives in Mumbai.");
		break;
		case "arjun": System.out.println("Arjun lives in Hyderabad.");
		break;
		case "akash": System.out.println("Akash lives in Bangaluru.");
		break;
		default: System.out.println(name+" lives in India.");
		}

	}

}
