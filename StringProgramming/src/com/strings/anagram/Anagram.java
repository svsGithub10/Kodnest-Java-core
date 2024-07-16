package com.strings.anagram;

//import java.util.Arrays;

public class Anagram {
	public static String checkAnagram(String s1,String s2) {
		
		//if size are different then anagram is not possible
		if(s1.length()!=s2.length()) {
			return "Both strings are not anagrams";
		}
		
		//size are equal then check for anagram
		else {
			int count=0;
			for(int i=0;i<=s1.length()-1;i++) {
				int flag=0;
				
				//find the same character in the second string if found then make flag=1
				for(int j=0;j<=s2.length()-1;j++) {
					if(s1.charAt(i)==s2.charAt(j)) flag=1;
				}
				
				//increment the count if character found
				if(flag==1) count++;
			}
			
			//if all characters are same in both string then count will be same as the string length
			if(count==s1.length()) return "Both strings are anagrams";
			else return "Both strings are not anagrams";
		}
//		else {
//			
//			//Converting the strings into char type array
//			char [] a1=s1.toCharArray();
//			char [] a2=s2.toCharArray();
//			
//			//Sorting arrays
//			Arrays.sort(a1);
//			Arrays.sort(a2);
//			
//			//Converting arrays to string
//			String str1=new String(a1);
//			String str2=new String(a2);
//			
//			//Checking whether both string are equal or not
//			if(str1.equals(str2)) return "Both strings are anagrams";
//			else return "Both strings are not anagrams";
//		}
	}
}
