package com.strings.frequency;

public class Frequency {
	public void checkFrequency(String s) {
		
		//First we create the string where it do not contains duplicate
		String newStr="";
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=0;j<=s.length()-1;j++) {
				if(!newStr.contains(s.charAt(i)+"")) {
					newStr=newStr+s.charAt(i);
				}
			}
		}
		
		//then we check for for each character frequency of string s
		for(int i=0;i<=newStr.length()-1;i++) {
			int count=0;
			//check for frequency
			for(int j=0;j<=s.length()-1;j++) {
				if(newStr.charAt(i)==s.charAt(j)) count++;
			}
			System.out.println(newStr.charAt(i)+" has frequency = "+count);
		}
	}
}
