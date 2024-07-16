package com.strings.findlongestword;

public class FindLongestWord {
	public String findLongestWord(String s) {
		String word="",longestWord="";
		for(int i=0;i<=s.length()-1;i++) {
			
			//Check if the word is longer than previous word or not
			if(s.charAt(i)==' ') {
				if(word.length()>longestWord.length()) longestWord=word;
				word="";
			}
			else word=word+s.charAt(i);
		}
		
		//Check for last word
		if(word.length()>longestWord.length()) longestWord=word;
		return longestWord;
	}
}
