package string_buffer;

public class pgm10 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("The quick brown fox jumps over the lazy dog");
		CharSequence cstr=str.subSequence(4, 10);
		System.out.println(str);
		System.out.println(cstr);
	}

}
