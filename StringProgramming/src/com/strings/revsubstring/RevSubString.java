package com.strings.revsubstring;

public class RevSubString {
	public static void subStrings(String s) {
		
		//Reversing the string
		String rev="";
		for(int i=0;i<=s.length()-1;i++) {
			rev=s.charAt(i)+rev;
		}
		
		//Creating a string to store substring
		String str="";
		
		//Logic to print all substrings
		for(int i=0;i<=s.length()-1;i++) {
			str="";
			for(int j=i;j<=s.length()-1;j++) {
				str=str+rev.charAt(j);
//				if(s.contains(str)) 
					System.out.println(str);	
			}
			System.out.println();
		}
	}



}
