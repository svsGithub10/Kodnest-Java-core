package string_buffer;

public class pgm3 {
	public static void main(String args[]) {
		System.out.println();
		String str="Advanced Java";
		System.out.println("Original string:"+str);
		int val1=str.codePointBefore(1);
		int val2=str.codePointBefore(9);
		System.out.println("character="+val1);
		System.out.println("character="+val2);
		System.out.println();
	}

}
