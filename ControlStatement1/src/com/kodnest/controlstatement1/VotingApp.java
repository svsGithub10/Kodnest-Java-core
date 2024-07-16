package com.kodnest.controlstatement1;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Voting v=new Voting();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		v.Age(age);

	}

}
