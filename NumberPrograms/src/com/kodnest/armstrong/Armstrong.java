package com.kodnest.armstrong;

public class Armstrong {
	//Logic to check armstrong or not
	public void display(long n) {
		long digit=1,res=0,real;
		System.out.print("Armstrong numbers between "+1+" to "+n+" : ");
		for(long i=1;i<=n;i++) {
		real=i;
		long count=0;
		while(i>0) {
			digit=i%10;
			i=i/10;
			count++;
		}
		i=real;
//		System.out.println(n);
		res=0;
		while(i>0) {
//			
			long power=1;
			digit=i%10;
			for(int j=1;j<=count;j++) {
				power=power*digit;
			}
//			System.out.println(digit+" "+power);
			res=res+power;
			i=i/10;
		}
//		System.out.println(res+" "+count);
		if(real==res) {
			System.out.print(" "+real);
		}
		i=real;
//		System.out.println(i);
		}
	}
}
