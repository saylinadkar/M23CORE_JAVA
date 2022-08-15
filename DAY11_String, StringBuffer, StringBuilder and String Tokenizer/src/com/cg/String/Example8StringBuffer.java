package com.cg.String;

public class Example8StringBuffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("jeva");
		System.out.println(s);
		System.out.println(s.charAt(1));
		s.setCharAt(1, 'a');
		System.out.println(s);
		System.out.println(s.charAt(1));
	
		// predict the op;-
		StringBuffer sb=new StringBuffer("try");
		System.out.println(sb);
	     //sb.setCharAt(3,'y'); throw StringIndexOutOfBoundsException 
		//System.out.println(sb);
		
	}

}
