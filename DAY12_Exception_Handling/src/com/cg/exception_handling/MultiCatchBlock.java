package com.cg.exception_handling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		try {
		int a=args.length;  //args=main function array
		System.out.println("a "+a);
		@SuppressWarnings("unused")
		int b=54/a;
		int arr[]= {12};
		arr[3]=65;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception  handle division by zero " +e);
		}
	/*	catch(ArrayIndexOutOfBoundsException a) 
		{
			System.out.println(a);
		}
		*/
		//do not us eException class in same catch block
		catch(Exception e2) 
		{
			System.out.println(e2);
		}
	
	}

}