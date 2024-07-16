package com.recursion.tables;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt(),ans=1,m=1;
		tables(n,m,ans);
		sc.close();
	}
	public static void tables(int n,int m,int ans) {
		if(m==11) return;
		else {
			ans=n*m;
			System.out.println(n+" x "+m+" = "+ans);
			tables(n,m+1,ans);
		}
	}
}
