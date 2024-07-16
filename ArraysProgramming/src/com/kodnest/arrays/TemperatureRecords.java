package com.kodnest.arrays;

public class TemperatureRecords {
	public double avg(double[] a) {
		double sum=0;
		for(double x:a) {
			sum=sum+x;
		}
		return sum/a.length;
	}
}
