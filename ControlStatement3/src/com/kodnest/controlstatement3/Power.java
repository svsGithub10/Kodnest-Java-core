package com.kodnest.controlstatement3;
//non static class
public class Power {
	int res=1;
	void calculate(int b, int p) {
		for(int i=1;i<=p;i++) { //calculating the result
			
			res=res*b;	//repeatedly multiplying the base value p times
		}
		System.out.println(res);
	}
}
