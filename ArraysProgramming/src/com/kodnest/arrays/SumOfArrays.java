package com.kodnest.arrays;

public class SumOfArrays {
	
	//Adding corresponding elements and storing it in c
	public int[] add(int a[],int[] b) {
		int[] c=new int[a.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i]+b[i];
		}
		return c;
	}

}
