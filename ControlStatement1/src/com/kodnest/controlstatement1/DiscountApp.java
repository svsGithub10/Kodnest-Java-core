package com.kodnest.controlstatement1;

import java.util.Scanner;

public class DiscountApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Discount d=new Discount();
		System.out.print("Enter the amount: $");
		int amt=sc.nextInt();
		d.Purchase(amt);
	}

}
