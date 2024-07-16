package com.kodnest.controlstatement1;

import java.util.Scanner;

class Program1_2{
	
	void positive(int a){
	if(a>0) {
		System.out.println("Positive number");
	}
	}
}

class Program1_2App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		Program1_2 p=new Program1_2(); 
		p.positive(a);

	}

}