package com.strings.lowertoupper;

public class LowerToUpper {
	public String convert(String s) {
		char [] a=s.toCharArray();
		String upper="";
		for(char x:a) {
			if(x>='a' && x<='z') {
				
				//converting to unicode and incrementing to lower case unicodes
				int c=x;
				c=c-32;
				char x1=(char) c;
				upper=upper+x1;
			}
			
			//appending loewr case as it is
			else upper=upper+x;
		}
		return upper;
		
	}

}
