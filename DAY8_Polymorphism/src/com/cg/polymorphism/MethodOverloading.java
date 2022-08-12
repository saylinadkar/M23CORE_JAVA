package com.cg.polymorphism;
//program on method overloading 
class shape 
{
	//by changing the number of argument 
 int  area (int a)
	{
		return a*a;
	}
	int area (int a,int b)
	{
		return a*b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		shape s=new shape();
		System.out.println(s.area(5));
		System.out.println(s.area(5, 2));
		

	}

}
