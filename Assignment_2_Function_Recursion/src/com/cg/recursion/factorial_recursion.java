package com.cg.recursion;

import java.util.Scanner;

public class factorial_recursion {

	static int factorial (int n)
	{
		if(n==1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
		System.out.println("factorial of no "+n+" is "+factorial(n)); //function call
	   sc.close();


	}

}
