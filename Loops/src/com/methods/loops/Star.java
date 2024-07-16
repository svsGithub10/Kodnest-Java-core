package com.methods.loops;

public class Star {

	public static void main(String[] args) {
		int n=1;
		for(int i=1; i<=5; i++) {	
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			n++;
			System.out.println();
			if(n==6)break;
		}
		int m=6;
		for(int i=5; i>=0; i--) {	
			for(int j=0;j>=m;j--) {
				System.out.print("*");
			}
			m--;
			System.out.println();
			if(m==0)break;
		}

	}

}
