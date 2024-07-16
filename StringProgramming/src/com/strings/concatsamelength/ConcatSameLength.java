package com.strings.concatsamelength;

public class ConcatSameLength {

	//Comparing the strings
	public String compare(String s1,String s2) {
		if(s1.length()==s2.length())return(s1+s2);
		else return "Both strings are of different length";
	}
}
