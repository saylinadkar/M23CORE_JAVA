package com.cg.interfacedemo;
interface A
{
	void print();
 void display();
}
class B implements A
{
	public void print()
	{
		System.out.println("welcom to technnoserve");
	}

	@Override
	public void display() {
		System.out.println("hello guys ");
		
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();
		obj.display();
		

	}

}
