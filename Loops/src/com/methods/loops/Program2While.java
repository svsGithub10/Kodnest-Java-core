package com.methods.loops;
class Program2While{
	public static void main(String[] args) {
		int a=0;
		while(a<10) {
			a++;
			if(a==6) {
				continue;
			}
			System.out.println(a);
		}
		
	}
}