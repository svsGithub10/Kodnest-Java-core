package com.kodnest.palindrome;

public class Palindrome {
	//Logic to check palindrome or not
	public void check(long n) {
		long rev=0,digit,real;
		real=n;
		while(n>0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
//		System.out.println(rev);	//We can check the reverse
		if(real==rev)
		System.out.println(real+" is palindrome.");
		else System.out.println(real+" is not palindrome.");
	}

}
