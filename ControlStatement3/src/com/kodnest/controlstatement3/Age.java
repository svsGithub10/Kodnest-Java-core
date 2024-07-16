package com.kodnest.controlstatement3;
//non static class for AgeApp
public class Age {	
	void Validate(int age) {	//creating a method to calculate
		if(age>=0 && age<=12) {	//Checking for child
			System.out.println("Person is a child");
		}
		else if(age>=13 && age<=19) {	//checking for teen
			System.out.println("Person is a Teen");
		}
		else if(age>=20 && age<=59) {	//checking for adult
			System.out.println("Person is an Adult");
		}
		else if(age>=60) {	//checking for senior citizen
			System.out.println("Person is a Senior");
		}
		else {	//result for any invalid values
			System.out.println("Invalid input");
		}
	}
}
