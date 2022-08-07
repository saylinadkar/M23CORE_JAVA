package com.cg.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Assignment operator 
		a*=b; //a=a*b
	//	a+=b; //a=a+b
	//	a-=b; //a=a-b
	//	a=b; //a=b
	//	a/=b; //a=a/b
	//	a%=b; //a=a%b
		
		System.out.println(a);
		sc.close();
	}}
