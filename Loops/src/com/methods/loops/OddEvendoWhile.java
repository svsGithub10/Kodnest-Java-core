package com.methods.loops;

public class OddEvendoWhile {

	public static void main(String[] args) {
		int i=-100;
		do {
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
			i++;
		}while(i<100);

	}

}

