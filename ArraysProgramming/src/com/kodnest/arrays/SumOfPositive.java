
package com.kodnest.arrays;

public class SumOfPositive {
	
	//Adding positive transactions
	public int result(int[] a) {
		int sum=0;
		for(int x:a) {
			if(x>0) {
				sum=sum+x;
			}
		}
		return sum;
	}

}
