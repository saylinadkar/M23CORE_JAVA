package com.cg.exception_handling;

import java.util.Scanner;

public class Arithmeticexception {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
try
{
	int a=15;
	System.out.println("enter value of b");
	int b=sc.nextInt();
	int res=a/b;
	System.out.println(res);
	
}
	catch(Exception e)
	{
		System.out.println("Exception handle: "+e);
	}

}}
