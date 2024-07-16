package com.kodnest.productofoddnumbers;

public class OddNumbersProduct { 
	public void product(int n) {	// method to display the result
		long prod = 1l;	//Initializing a variable to store the result
		//Logic to get the product of first n odd numbers
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				prod = prod * i;
			}
		}
		System.out.println("Product of first " + n + " odd numbers = " + prod);
	}

}
