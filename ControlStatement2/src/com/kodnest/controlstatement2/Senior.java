package com.kodnest.controlstatement2;
//non-static class for SeniorApp
public class Senior {
	void person(int age) {	//creating the a method
		if(age>=60) {	//checking the condition
			System.out.println("Person is eligible for senior citizen discount");	//result, if condition true
		}
		else {
			System.out.println("Person is not eligible for senior citizen discount");	//result, if condition false 
		}
	}
}
