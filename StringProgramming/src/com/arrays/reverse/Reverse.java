package com.arrays.reverse;

public class Reverse {
	
	//Reversing string
	public String reverse(String s) {
		String rev="";
		char[] a=s.toCharArray();
		for(char x:a) {
			rev=x+rev;
		}
		return rev;
	}

}
