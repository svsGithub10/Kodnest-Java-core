package com.kodnest.controlstatement3;

public class Numbers {
	void check(int a,int b,int c) { //method to verify
		if(a==b && a==c) {	//if all are equal
			System.out.println("All are equal");
		}
		else if(a>b && a>c) {	//if a is larger
			System.out.println(a+" is larger");
		}
		else if(b>a && b>c) {	//if b is larger
			System.out.println(b+" is larger");
		}
		else {	//if c is larger
			System.out.println(c+" is larger");
		}
	}
}
