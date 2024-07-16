package com.kodnest.controlstatement2;
//Non-static class for LeapYearApp
public class LeapYear {
	void year(int y) {	//creating the a method
		if(y%4==0) {	//Checking whether given year is leap year!
			System.out.println(y+" is leap year");	//result, if condition is true
		}
		else {
			System.out.println(y+" is not leap year");	//result, if condition is false
		}
	}
}
