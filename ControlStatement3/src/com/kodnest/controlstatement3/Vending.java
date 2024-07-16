package com.kodnest.controlstatement3;
//non static class for VendingApp
public class Vending {
	void Pick(String str) {	//method to pick the product according to ID
		switch(str) {
		case "P01": System.out.println("Coca-Cola");	//for ID P01
		break;
		case "P02": System.out.println("Pepsi");	//for ID P02
		break;
		case "P03": System.out.println("Maggi");	//for ID P03
		break;
		case "P04": System.out.println("Coockies");//for ID P04
		break;
		case "P05": System.out.println("Noodles");	//for ID P05
		break;
		case "P06": System.out.println("7-up");	//for ID P06
		break;
		default: System.out.println("Invalid product ID");	//False ID
		break;
		}
	}
}
