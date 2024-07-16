package com.strings.uppertolowerandlowertoupper;

public class UpperToLowerAndLowerToUpper {
	public String convert(String s) {
		char [] a=s.toCharArray();
		String res="";
		for(char x:a) {
			if(x>='a' && x<='z') {

				//converting to unicode and decrementing to upper case unicodes
				int c=x;
				c=c-32;
				char x1=(char) c;
				res=res+x1;
			}

			else if(x>='A' && x<='Z') {

				//converting to unicode and incrementing to lower case unicodes
				int c=x;
				c=c+32;
				char x1=(char) c;
				res=res+x1;
			}
			
			//Append other characters
			else res=res+x;
		}
		return res;

	}
}