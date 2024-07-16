package com.strings.palindrome;

public class Palindrome {
	
	//check for palindrome
	public String check(String s) {
		String rev="";
		char[] a=s.toCharArray();
		for(char x:a) {
			rev=x+rev;
		}
		if(s.equals(rev))return "Given string is palindrome";
		else return "Given string is not palindrome";
	}

}
