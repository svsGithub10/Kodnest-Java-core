package com.kodnest.methods2;

public class ArithmeticOperation {
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	public static double devideNumbers(double num1, double num2) {
		return num1/num2;
	}
	public static int findReminder(int num1, int num2) {
		return num1%num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subtractNumbers(20,5));
		System.out.println(multiplyNumbers(4,5));
		System.out.println(devideNumbers(20,4));
		System.out.println(findReminder(10,3));
	}

}
