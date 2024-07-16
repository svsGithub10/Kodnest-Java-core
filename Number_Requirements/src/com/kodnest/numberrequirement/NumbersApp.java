package com.kodnest.numberrequirement;

import java.util.Scanner;	//importing the scanner package

public class NumbersApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//creating the scanner object
		Numbers N=new Numbers();	//creating the class object
		System.out.println("Enter a number greater than 100 :");
		int n=sc.nextInt();	//read the value of n
		if(n<100) {	//if n is not greater than 100
			System.out.println(n+" is not greater than 100.");
		}
		else {	//when the value of n is satisfied
			N.divisibleBy2(n);	//prints numbers divisible by 2
			N.divisibleBy3(n);	//prints numbers divisible by 3
			N.divisibleBy5(n);	//prints numbers divisible by 5
			N.divisibleBy2and5(n);	//prints numbers divisible by 2 and 5
			N.divisibleBy3andInTable5(n);	//prints numbers divisible by 3 and in tables of 5
			N.prime(n);	//prints prime numbers
			N.evenPrime(n);	//prints even prime numbers
			N.oddPrime(n);	//prints odd prime numbers
			N.evenDivisibleBy3(n);	//prints even numbers divisible by 3
			N.oddDivisibleBy5(n);	//prints odd numbers divisible by 5
		}
		
	}

}
