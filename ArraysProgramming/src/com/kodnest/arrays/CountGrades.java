package com.kodnest.arrays;

public class CountGrades {
	
	//Calculate the no. of students who got score >75
	public int calculate(int[] a) {
		int count=0;
		for(int x:a) {
			if(x>75) {
				count++;
			}
		}
		return count;
	}
}
