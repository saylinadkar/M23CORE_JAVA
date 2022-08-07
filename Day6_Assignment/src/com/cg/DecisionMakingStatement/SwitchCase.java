package com.cg.DecisionMakingStatement;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("choose a number between 1,2or3 to set the callertune");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
         System.out.println("callertune set for kesariya");
             break;
		case 2:
	         System.out.println("callertune set for shrivali");
	         break;
		case 3:
	         System.out.println("callertune set for RRR");
	         break;
        default:
	        System.out.println("invalid input");
	  sc.close();
		}}}
		
		