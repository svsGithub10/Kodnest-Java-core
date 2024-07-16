package com.kodnest.methods3;
public class Alphabets {
	void verify(char ch) {
		if(ch>='A' && ch<='Z') {	//check whether its upper case or not
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {	//check whether its upper case vowel or not
				System.out.println(ch+" is a upper case vowel");
			}
			else {	//if its not vowel then it must be consonant
				System.out.println(ch+" is a upper case consonent");
			}
		}
		else if(ch>='a' && ch<='z') {	//check whether its lower case or not
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {	//check whether its lower case vowel or not
				System.out.println(ch+" is a lower case vowel");
			}
			else {	//if its not vowel then it must be consonant
				System.out.println(ch+" is a lower case consonent");
			}
		}
		else if(ch>='0' && ch<='9') {	//check if its a digit
			System.out.println(ch+" is a digit");
		}
		else {	//if its not an alphabet or digit then it must be a special character
			System.out.println(ch+" is a special charecter");
		}
	}
}
