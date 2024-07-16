package com.kodnest.productofoddnumbers;

import java.util.Scanner;

public class OddNumbersProductApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//Creating scanner object
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();	//Getting the user value
		sc.close(); 	//closing the scanner object
		OddNumbersProduct O=new OddNumbersProduct();	//creating the class object
		O.product(n);	//Calling the display method for result

	}

}
