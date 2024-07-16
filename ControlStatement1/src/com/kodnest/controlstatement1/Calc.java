package com.kodnest.controlstatement1;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		double a,b;
		char op;
		String d="y";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the operator :");
		op=sc.next().charAt(0);
		if(op=='+') {
			System.out.println(a+" + "+b+" = "+(a+b));
		}
		else if(op=='-') {
			System.out.println(a+" - "+b+" = "+(a-b));
		}
		else if(op=='*') {
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		else if(op=='/') {
			if(b==0) {
				System.out.println("Division error");
			}
			else {
			System.out.println(a+" / "+b+" = "+(a/b));
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}
}