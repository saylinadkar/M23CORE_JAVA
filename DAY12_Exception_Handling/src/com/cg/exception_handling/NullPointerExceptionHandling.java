package com.cg.exception_handling;

public class NullPointerExceptionHandling {
	@SuppressWarnings("null")
	public static void main(String args[])
	{
		String str=null;
		
		try
		{
			str.equals("java");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception handle: "+e);
			
		}
	}
}