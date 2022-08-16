package com.cg.operator;

public class UranaryOperator {

	public static void main(String[] args) {
	 int a=5,b=3;
	 int x=a++; //5
	 @SuppressWarnings("unused")
	int y=++b;  //4
	 int res=a+x; //6+5=11
	 System.out.println(res);
	 
	  

	  
	 int p=5,q=3;
	 int m=p--; //5
	 @SuppressWarnings("unused")
	int n=--q; //2
	 int res1=p+m; //4+5=9
	 System.out.println(res1);
	
	  



	}

}
