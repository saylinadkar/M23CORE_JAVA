package com.cg.exception_handling;

public class ThrowException {
static void display() {
try{
	
    System.out.println("first line");
	System.out.println("second line");
    throw new RuntimeException();
}
finally
{
	System.out.println("abcd");
	
}
}
	public static void main(String[] args) {
		try
		{
			display();
		}
		catch(Exception e)
		{
			System.out.println("third line");
		}

	}

}
