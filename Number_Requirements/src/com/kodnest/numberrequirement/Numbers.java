package com.kodnest.numberrequirement;
//non static class for NumbersApp
public class Numbers {
	void divisibleBy2(int n) {	//function to get numbers divisible by 2 
		System.out.print("Divisible by 2 :");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {	//checking if the number is divisible by 2 or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void divisibleBy3(int n) {	//function to get numbers divisible by 3
		System.out.print("Divisible by 3 :");
		for(int i=1;i<=n;i++) {
			if(i%3==0) {	//checking if the number is divisible by 3 or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void divisibleBy5(int n) {	//function to get numbers divisible by 5
		System.out.print("Divisible by 5 :");
		for(int i=1;i<=n;i++) {
			if(i%5==0) {	//checking if the number is divisible by 5 or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void divisibleBy2and5(int n) {	//function to get numbers divisible by 2 and 5
		System.out.print("Divisible by 2 and 5 :");
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%5==0) {	//checking if the number is divisible by 2 and 5 or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void divisibleBy3andInTable5(int n) {	//function to get numbers divisible by 3 and in table 5
		System.out.print("Divisible by 3 and in table 5 :");
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {	//checking if the number is divisible by 3 and in the table of 5 or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void prime(int n) {	//function to get prime numbers

		System.out.print("Prime numbers :");
		for(int i=1;i<=n;i++) {
			//prime numbers must be divisible by 1 and itself i.e., 2 numbers only, if is greater than 2 then is not prime
			int count=0;	//Initializing a variable to count the number of divisible numbers
			for(int j=1;j<=i;j++) {
				if(i%j==0) {	
					count++;	//if j is divisible by i then increment the count
				}
			}
			if(count==2) {	//checking the count value which must be 2
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void evenPrime(int n) {	//function to get even prime numbers
		System.out.print("Even Prime numbers :");
		for(int i=1;i<=n;i++) {
			//prime numbers must be divisible by 1 and itself i.e., 2 numbers only, if is greater than 2 then is not prime
			int count=0;	//Initializing a variable to count the number of divisible numbers
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;	//if j is divisible by i then increment the count
				}
			}
			if(count==2 && i%2==0) {	//checking the count value which must be 2 and the number is even or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void oddPrime(int n) {	//function to get odd prime numbers
		System.out.print("Odd Prime numbers :");
		for(int i=1;i<=n;i++) {
			//prime numbers must be divisible by 1 and itself i.e., 2 numbers only, if is greater than 2 then is not prime
			int count=0;	//Initializing a variable to count the number of divisible numbers
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;	//if j is divisible by i then increment the count
				}
			}
			if(count==2 && i%2!=0) {	//checking the count value which must be 2 and the number is odd or not
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void evenDivisibleBy3(int n) {	//function to get even numbers which are divisible by 3
		System.out.print("Even numbers Divisible by 3 :");
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%2==0) {	//checking if the number is even and divisible by 3
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
	void oddDivisibleBy5(int n) {	//function to get odd numbers which are divisible by 5
		System.out.print("Odd numbers Divisible by 5 :");
		for(int i=1;i<=n;i++) {
			if(i%5==0 && i%2!=0) {	//checking if the number is odd and divisible by 5
				System.out.print(" "+i);	//printing the result
			}
		}
		System.out.println();
	}
}

