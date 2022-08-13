package com.cg.function;
import java.util.Scanner;

public class Factorial {
	//function defination 
static int factorial (int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
		
	{
		fact=fact*i;
	}
	return fact;
}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.");
	int n=sc.nextInt();
	System.out.println("factorial of no "+n+" is "+factorial(n)); //function call
   sc.close();

	}

}
