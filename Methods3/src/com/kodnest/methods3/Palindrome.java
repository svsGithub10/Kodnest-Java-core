package com.kodnest.methods3;

public class Palindrome {
	int n;
	void check(long n) {
		long set=0,rev=0;	//initializing variables to store reverse value
		long real=n;	//set n to real retrieve the original value
		while(n>0) {	//looping until n becomes 0
			set=n%10;	//getting the last digit
			rev=rev*10+set;	//obtaining the reverse of the number
			n=n/10;	//breaking the last digit
		}
		if(real==rev) {	//if user value is equals to reverse of it then
			System.out.println(real+" is palindrome");
		}
		else {	
			System.out.println(real+" is not palindrome");	//negative result
		}
	}
}
