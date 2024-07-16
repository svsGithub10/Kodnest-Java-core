package com.methods.loops;

public class Divisibleby3for {

	public static void main(String[] args) {
		int sum=0,count=0;
		System.out.println("Numbers that are Divisible by 3 : ");
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
				sum=sum+i;
				count++;
			}
		}
		System.out.println();
		System.out.println("Sum = "+sum);
		System.out.println("Count = "+count);
	}

}
