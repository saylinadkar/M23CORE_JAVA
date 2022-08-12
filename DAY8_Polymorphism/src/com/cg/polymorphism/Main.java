package com.cg.polymorphism;
class parent 
{
	void m1()
	{
		System.out.println("parent m1");
		
	}
}
public class Main extends parent 

{
void m1()
{
	System.out.println("child m1");

}
void m2()
{
	System.out.println("child m2");
	
}
	public static void main(String[] args) {
	parent p=new Main();
	p.m1();
	Main m=new Main();
	m.m2();
	
	
	}

}
