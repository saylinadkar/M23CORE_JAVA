package com.cg.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=5,b=7;
		boolean res=(a<b && b>10);
		boolean res2=(a<b || b>10);
		boolean res3=!(a>b);

		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		
		


	}

}
