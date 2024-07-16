package com.methods.loops;

public class OddEvenfor {

	public static void main(String[] args) {
		for(int i=-100;i<=100;i++) {
			if(i<0) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
			}
			if(i==0) {
				System.out.println();
			}
			if(i>0) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
		}

	}

}
