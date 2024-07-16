package com.kodnest.armstrongornot;

public class ArmstrongOrNot {
	//Logic to check armstrong or not
	public void check(long n) {
		long count=0,digit=1,res=0,real;
		real=n;
		while(n>0) {
			digit=n%10;
			n=n/10;
			count++;
		}
		n=real;
//		System.out.println(n);
		while(n>0) {
			long power=1;
			digit=n%10;
			for(int i=1;i<=count;i++) {
				power=power*digit;
			}
//			System.out.println(digit+" "+power);
			res=res+power;
			n=n/10;
		}
//		System.out.println(res+" "+count);
		if(real==res) {
			System.out.println(real+" is an Armstrong number");
		}
		else {
			System.out.println(real+" is not an Armstrong number");
		}
	}
}
