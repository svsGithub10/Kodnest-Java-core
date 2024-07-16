package com.learning.strings;

import java.util.Scanner;

public class NumberCounter {

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();
			String[] a = str.split(" ");
			String temp=a[0];
			int count=1;
			for (String x : a) {
//				System.out.println(x);
				if(!x.equals(temp)) {
					count++;
					temp=x;
				}
		}
			System.out.println(count);
		}


}
