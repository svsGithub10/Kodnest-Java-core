package com.kodnest.controlstatement3;
//non static class for RectSqrApp
public class RectSqr {
	void Valid(int l,int b) {	//method for validation
		if(l==b) {	//checking the sides
			System.out.println("Given rectangle is Square");
		}
		else {
			System.out.println("Given rectangle is not Square");
		}
	}
}
