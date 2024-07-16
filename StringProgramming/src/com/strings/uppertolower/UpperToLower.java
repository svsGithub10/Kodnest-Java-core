package com.strings.uppertolower;

public class UpperToLower {
	public String convert(String s) {
		char [] a=s.toCharArray();
		String lower="";
		for(char x:a) {
			if(x>='A' && x<='Z') {
				
				//converting to unicode and incrementing to lower case unicodes
				int c=x;
				c=c+32;
				char x1=(char) c;
				lower=lower+x1;
			}
			
			//appending loewr case as it is
			else lower=lower+x;
		}
		return lower;
		
	}

}
