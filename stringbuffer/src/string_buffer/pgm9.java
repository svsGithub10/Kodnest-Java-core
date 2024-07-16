package string_buffer;

public class pgm9 {
	public static void main(String args[]) {
		StringBuffer strbuff=new StringBuffer("Advanced Java");
		System.out.println("\n contents of buffer:"+strbuff);
		int index=3;
		int codePointOffset=9;
		System.out.println("Result:"+strbuff.offsetByCodePoints(index,codePointOffset));
		
		
	}

}
