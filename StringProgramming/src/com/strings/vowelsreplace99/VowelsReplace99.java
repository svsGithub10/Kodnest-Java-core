package com.strings.vowelsreplace99;

public class VowelsReplace99 {
	public static String replace(String s) {
		String res="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'  || s.charAt(i)=='U') {
				res=res+"99";
			}
			else res=res+s.charAt(i);
		}
		return res;
	}

}
