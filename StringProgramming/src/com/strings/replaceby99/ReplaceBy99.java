package com.strings.replaceby99;

public class ReplaceBy99 {
	public String replaceSpace(String S) {
		String res="";
		
		//Find the space character and replace it by 99
		for(int i=0;i<=S.length()-1;i++) {
			if(S.charAt(i)==' ') res=res+"99";
			else res=res+S.charAt(i);
		}
		return res;
	}
}
