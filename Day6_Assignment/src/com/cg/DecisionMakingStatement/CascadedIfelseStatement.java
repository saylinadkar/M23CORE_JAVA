package com.cg.DecisionMakingStatement;

public class CascadedIfelseStatement {

	public static void main(String[] args) {
		int a=10,b=5,c=23;
		if(a>b && a>c)
		{
			System.out.println("a="+a+" is greater value ");
		}
		else if(b>a && b>c)
		{
			System.out.println("b="+b+" is greater value ");

		}
		else
		{
			System.out.println("c="+c+" is a greater value");
		}
		

	}

}
