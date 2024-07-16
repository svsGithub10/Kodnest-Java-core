package com.strings.removeduplicates;

public class RemoveDuplicates {
	public String printRes(String s) {
		
		//logic to remove duplicates
		String res="";
		
//		char[] a=s.toCharArray();
//		int n=a.length;
//		for(int i=0;i<n;i++) {
//			int j=0;
//			
//			//break the loop if duplicate found
//			for(j=0;j<i;j++) {
//				if(a[i]==a[j]) break;
//			}
//			
//			//append character if there are no duplicates
//			if(j==i) res=res+a[i];
//		}
		
		for(int i=0;i<=s.length()-1;i++) {
			if(!res.contains(s.charAt(i)+"")) {
				res=res+s.charAt(i);
			}
		}
		return res;
	}

}
