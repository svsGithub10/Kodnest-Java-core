package com.kodnest.controlstatement2;
//Non-static class for Multipleof10App
public class Multipleof10 {	
	void check(int n) {	//creating the method
		if(n%10==0) {	//checking the condition
			System.out.println(n+" is multiple of 10");	//result, if condition true
		}
		else {
			System.out.println(n+" is not multiple of 10");	//result, if condition false
		}
	}
}
