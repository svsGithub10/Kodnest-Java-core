package com.kodnest.power;

public class Power {
	public void calculate(int b,int p) {
		//Logic to calculate power of n
		int res=1;
		if(p==0) {
			System.out.println(b+" power of "+p+" : 1");
		}
		else {
			for(int i=1;i<=p;i++) {
				res=res*b;
			}
			System.out.println(b+" power of "+p+" : "+res);
		}
	}

}
