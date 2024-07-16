package com.kodnest.controlstatement2;
//non-static class for DiscountApp
class Discount {
	void Purchase(int amt) { //creating the a method
		if(amt>100) { //checking the amount value
			System.out.println("Discount applicable"); //printing the result
		}
	}
}
