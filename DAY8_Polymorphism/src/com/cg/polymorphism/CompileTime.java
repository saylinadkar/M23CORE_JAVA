package com.cg.polymorphism;
//program for function overloading 
class A 
{
	//by having a different types of argument 
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);

	}
}
public class CompileTime {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(10, 20);
		obj.add(1.2f, 4.3f);
	}

}
