package com.methods.loops;

public class Divisibleby3While {

	public static void main(String[] args) {
		int sum=0,count=0;
		System.out.println("Numbers that are Divisible by 3 : ");
		int i=1;
		while(i<50) {
			if(i%3==0) {
				System.out.print(i+" ");
				sum=sum+i;
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("Sum = "+sum);
		System.out.println("Count = "+count);
	}

}
