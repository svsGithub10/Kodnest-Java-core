package com.strings.reversewords;

public class ReverseWords {
	public String reverseWords(String s) {
		String word="",res="";
//		for(int i=0;i<=s.length()-1;i++) {
//
//			//rearrange words
//			if(s.charAt(i)==' ') {
//				res=res+word+" ";
//				word="";
//			}
//			else word=s.charAt(i)+word;
//		}
		
		String str[]=s.split(" ");
		for(int i=0;i<=str.length-1;i++) {
			word="";
			for(int j=0;j<=str[i].length()-1;j++) {
				word=str[i].charAt(j)+word;
			}
			res = res+word+" ";
		
		}

		//Add last word and return the result
//		res=res+word+" ";
		return res;
	}
}
