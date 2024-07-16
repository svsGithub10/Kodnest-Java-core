package com.methods.loops;

public class Farmer {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) 
		{
			for(int j=1;j<=5;j++) 
			{
				System.out.println("Farmer has sowed the seed in row "+i+" and spot "+j);
//				System.out.print("* ");
			}
//			System.out.println();
		}
		System.out.println("Completed sowing in all the rows");

	}

}
