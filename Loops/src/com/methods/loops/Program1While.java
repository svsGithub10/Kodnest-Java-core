package com.methods.loops;
class Program1While{
	public static void main(String[] args) {
		int a=0;
		while(a<10) {
			a++;
			if(a==7) {
				break;
			}
			System.out.println(a);
		}
		
	}
}