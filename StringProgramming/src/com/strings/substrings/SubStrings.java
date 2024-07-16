package com.strings.substrings;

public class SubStrings {
	public static void subStrings(String s) {
		
		//Creating a string to store substring
		String str="";
		
		//Logic to print all substrings
		for(int i=0;i<=s.length()-1;i++) {
			str="";
			for(int j=i;j<=s.length()-1;j++) {
				str=str+s.charAt(j);
//				if(s.contains(str)) 
					System.out.println(str);	
			}
			System.out.println();
		}
	}

}
