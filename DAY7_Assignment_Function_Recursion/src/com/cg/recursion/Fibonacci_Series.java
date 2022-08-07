package com.cg.recursion;

import java.util.Scanner;

public class Fibonacci_Series {
//function defination 
	public static int fib(int n)
	{
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
		System.out.println(fib(n)); //function call
	   sc.close();
	}}

