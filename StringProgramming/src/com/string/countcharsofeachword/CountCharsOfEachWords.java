package com.string.countcharsofeachword;

public class CountCharsOfEachWords {
	public static void countChars(String str) {
		
		/*//Convert string to string array 
		String [] s=str.split(" ");
		
		//Print the size of each words that will be the number of characters
		for(String x:s) {
			System.out.println("Charecters present in \""+x+"\" is: "+x.length());
		}*/
		
		String word="";
		String [] sArr=new String[100];
		int count=0;
		
		//Splitting the words without using split() method
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' ') {
				count++;
				sArr[count]=word;
				word="";
			}
			else word=word+str.charAt(i);
		}
		
		//Assigning last word
		count++;
		sArr[count]=word;
		
		//Print the size of each words that will be the number of characters
		for(int i=1;i<=count;i++) {
			System.out.println("Charecters present in \""+sArr[i]+"\" is: "+sArr[i].length());
		}
	}
}
