package com.methods.loops;

public class Teacher {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=2;j++) {
				for(int k=1;k<=10;k++) {
					if((i%2!=0)&&(k%2==0)){
						System.out.println("School "+i+" class "+j+" Student "+k+" have completed the assignment.");
					}
					else if((i%2==0)&&(k%2!=0)){
						System.out.println("School "+i+" class "+j+" Student "+k+" have not completed the assignment.");
					}
					else {
						System.out.println("School "+i+" class "+j+" Student "+k+" is still doing the assignment.");
					}
				}
			}
			System.out.println();
		}
		System.out.println("All the assignments are checked");

	}

}
