package string_buffer;

public class pgm4 {
	public static void main(String args[]) {
		System.out.println();
		String str="Advanced Java";
		System.out.println("Original string:"+str);
		int ctr=str.codePointCount(1, 10);
		System.out.println("codePointCount="+ctr);
		System.out.println();
		
	}

}
