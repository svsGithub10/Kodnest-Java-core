package com.kodnest.controlstatement1;

import java.util.Scanner;

public class PositiveNumApp {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=sc.nextInt();
			PositiveNum p=new PositiveNum();
			p.num(a);

	}

}
