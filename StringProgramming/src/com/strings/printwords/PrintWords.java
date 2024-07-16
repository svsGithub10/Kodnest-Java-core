package com.strings.printwords;

public class PrintWords {
	public static void printWords(String str) {
		
		/*//Converting String to string array
		String [] s=str.split(" ");
		
		//Get the size of array i.e. number of words
		int n=s.length;
		
		//Print the number of words
		System.out.println("Total number of words are: "+n);
		
		//Print each words present in the sentence 
		for(int i=0;i<=n-1;i++) {
			System.out.println("Word "+(i+1)+": "+s[i]);
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
		
		//Print the number of words
		System.out.println("Total number of words are: "+count);
		
		//Print each words present in the sentence 
		for(int i=1;i<=count;i++) {
			System.out.println("Word "+(i)+": "+sArr[i]);
		}
	}
}
