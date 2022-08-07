package com.cg.DecisionMakingStatement;

public class NestedIf {

	public static void main(String[] args) {
	int age=15,weight=140;
	if(age>=12)
	{
		if(weight>=40)
			
		{
			if(weight<=110)
				
			{
				System.out.println("You are eligible for bunjee jumping");
			}
			else 
			{
				System.out.println("extra rope will be added");
				
			}}
			else 
			{
				System.out.println("you are not eligible for bunjee jumping");

			}}
		else
		{
			System.out.println("you are not eligible for bunjee jumping");

		}
		}
	
	}


