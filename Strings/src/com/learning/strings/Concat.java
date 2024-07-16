package com.learning.strings;

public class Concat {

	public static void main(String[] args) {
		String s1="JAVA";
		System.out.println(s1);
		String s2=s1.concat("TECH");
		System.out.println(s1);
		System.out.println(s2);
		String s3="JAVATECH";
		if(s3==s2) System.out.println("Its is Inside string pool");
		else System.out.println("It is Outside string pool");
	}

}
