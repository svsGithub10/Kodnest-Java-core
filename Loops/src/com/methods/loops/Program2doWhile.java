package com.methods.loops;
class Program2doWhile{
	public static void main(String[] args) {
		int a=0;
		do{
			a++;
			if(a==6) {
				continue;
			}
			System.out.println(a);
		}while(a<10);
		
	}
}