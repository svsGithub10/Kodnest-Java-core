package com.kodnest.controlstatement1;

import java.util.Scanner;

public class CalcSwitch {
	public static void main(String[] args) {
		double a,b;
		char op,d;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the operator :");
		op=sc.next().charAt(0);

		switch (op) {
		case '+' : System.out.println(a+" + "+b+" = "+(a+b));
		break;
		case '-' : System.out.println(a+" - "+b+" = "+(a-b));
		break;
		case '*' : System.out.println(a+" * "+b+" = "+(a*b));
		break;
		case '/' : 	if(b==0) {
						System.out.println("Division error");
					}
					else {
						System.out.println(a+" / "+b+" = "+(a/b));
					};
		break;
		default : System.out.println("Invalid input");
		}
		System.out.println("Want to continue (y/n): ");
		d=sc.next().charAt(0);
		if(d=='n') {
			break;
		}
		}
	}
}
