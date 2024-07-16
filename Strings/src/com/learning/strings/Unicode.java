package com.learning.strings;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char d='Y';
		while(d=='Y') {
			System.out.println("What do you want to perform?\n1.Character to unicode\n2.Unicode to character");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.print("Enter a charecter: ");
				char ch=sc.next().charAt(0);
				int a=ch;
				System.out.println("The unicode value of "+ch+" is: "+a);
			}
			else if(choice==2) {
				System.out.println("Enter a unicode value: ");
				int a=sc.nextInt();
				char ch=(char) a;
				System.out.println("The charecter of code "+a+" is : "+ch);
			}
			else {
				System.out.println("Invalid choice");
				continue;
			}
			System.out.print("Want to continue (Y or N): ");
			d=sc.next().charAt(0);

		}
		sc.close();
	}
}
