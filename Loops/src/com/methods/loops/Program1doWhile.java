package com.methods.loops;
class Program1doWhile{
	public static void main(String[] args) {
		int a=0;
		do{
			a++;
			if(a==7) {
				break;
			}
			System.out.println(a);
		}while(a<10);
		
	}
}