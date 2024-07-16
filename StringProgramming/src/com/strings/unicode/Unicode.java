package com.strings.unicode;

public class Unicode {

	//Print unicodes of each characters
	public void printValue(String S) {
		char[] a=S.toCharArray();
		for(char x:a) {
			int code=x;
			System.out.println("Unicode value of "+x+" = "+code);
		}
	}
}
