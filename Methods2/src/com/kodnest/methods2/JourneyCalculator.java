package com.kodnest.methods2;

class JourneyCalculator {
	double speed;
	double time;
	double calculateDistance(double speed,double time) {
		return speed*time;
	}
}
	
class JourneyCalculatorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(60.0,1.5));
	}

}
