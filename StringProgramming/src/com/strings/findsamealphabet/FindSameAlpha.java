package com.strings.findsamealphabet;

public class FindSameAlpha {
	public static String findSameAlpha(String s1,String s2) {
		String res="",finalRes="";
		for(int i=0;i<=s1.length()-1;i++) {
			for(int j=0;j<=s2.length()-1;j++) {
				if(s1.charAt(i)==s2.charAt(j)) 
					res=res+s2.charAt(j);
			}
		}
		for(int i=0;i<=res.length()-1;i++) {
			if(!(finalRes.contains(res.charAt(i)+""))) {
					if(res.charAt(i)!=' ')finalRes=finalRes+res.charAt(i);
			}
		}
		return finalRes;
	}

}
