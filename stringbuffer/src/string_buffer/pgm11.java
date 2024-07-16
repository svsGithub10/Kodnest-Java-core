package string_buffer;

public class pgm11 {
	public static void main(String args[]) {
	    StringBuffer str=new StringBuffer("Advanced Java");
	    str.append("And J2EE");
	    System.out.println("capacity before"+"applying trimToSize()="+str.capacity());
	    str.trimToSize();
	    System.out.println("string="+str.toString());
        System.out.println("capacity after"+"applying timeToSize()="+str.capacity());
        
	    
	}
}
