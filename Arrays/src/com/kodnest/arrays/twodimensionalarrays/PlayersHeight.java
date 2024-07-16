package com.kodnest.arrays.twodimensionalarrays;

import java.util.Scanner;

public class PlayersHeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of teams : ");
		int row=sc.nextInt();
		System.out.print("Enter the number of players in each team : ");
		int col=sc.nextInt();
		double[][] a=new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter team "+(i+1)+" player "+(j+1)+" height : ");
				a[i][j]=sc.nextDouble();
			}
		}
		sc.close();
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Team "+(i+1)+" player "+(j+1)+" height : "+a[i][j]);
			}
		}
	}

}
