package com.kodnest.methods2;

class FinanceCalculator {
	double principal,rate,time;
	double calculateSimpleInterest(double principal, double rate, double time) {
		return principal*rate*time;
	}
}
class FinanceCalculatorApp{
	public static void main(String[] args) {
		FinanceCalculator calculator=new FinanceCalculator();
		double SI=calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
		System.out.println(SI);
	}
}
