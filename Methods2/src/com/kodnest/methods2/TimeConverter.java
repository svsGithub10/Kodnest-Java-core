package com.kodnest.methods2;

public class TimeConverter {
	public static double convertToHours(int munites) {
		return munites/60.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hours=convertToHours(90);
		System.out.println(hours);
	}

}
