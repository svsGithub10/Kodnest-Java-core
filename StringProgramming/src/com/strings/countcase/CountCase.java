package com.strings.countcase;

public class CountCase {
	public void count(String s) {
		char [] a=s.toCharArray();
		int upper=0,lower=0;
		for(char x:a) {
			if(x>='A' && x<='Z') upper++;
			else if(x>='a' && x<='z') lower++;
		}
		System.out.println("Number of upper case letters: "+upper);
		System.out.println("Number of lower case letters: "+lower);
	}

}
