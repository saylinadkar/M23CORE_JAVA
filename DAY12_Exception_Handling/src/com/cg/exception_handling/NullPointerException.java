package com.cg.exception_handling;

public class NullPointerException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str=null;
		try
		{
			str.equals("java");
		}
		catch(Exception e)
		{
			str=new String("java");
			System.out.println(str.equals("java"));
			
		}
	}

}
