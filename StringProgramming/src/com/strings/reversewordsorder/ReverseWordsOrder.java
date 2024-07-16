package com.strings.reversewordsorder;

public class ReverseWordsOrder {
	public String reverseWordsOrder(String s) {
		String word="",res="";
		for(int i=0;i<=s.length()-1;i++) {

			//rearrange words
			if(s.charAt(i)==' ') {
				res=word+res+" ";
				word="";
			}
			else word=word+s.charAt(i);
		}
		
//		String str[]=s.split(" ");
//		for(int i=str.length-1;i>=0;i--) {
//			res=res+str[i]+" ";
//		}

		//Add last word and return the result
		res=word+res+" ";
		return res;
	}
}
