package com.kodnest.controlstatement1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a>=1 && a<=10) {
			System.out.println("Range 1");
		}
		else if(a>=11 && a<=20) {
			System.out.println("Range 2");
		}
		else if(a>=21 && a<=30){
			System.out.println("Range 3");
		}
		else if(a>=31 && a<=40) {
			System.out.println("Range 4");
		}
		else if(a>=41 && a<=50) {
			System.out.println("Range 5");
		}
		else {
			System.out.println("Outside range");
		}
	}

}
