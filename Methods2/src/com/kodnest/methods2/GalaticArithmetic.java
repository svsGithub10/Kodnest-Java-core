package com.kodnest.methods2;

import java.util.*;

public class GalaticArithmetic {
	
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		sc.close();
		System.out.println(galacticAddition(a,b));
	}

}
