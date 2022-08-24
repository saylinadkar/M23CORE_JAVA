package com.cg.lamdaexpression;
interface A
{
	void print();
}
//length of code increase using implementable class 
/*class B implements A
{
	public void print()
	{
		System.out.println("Functional interface implementation without lamda expression");
	}
}*/
public class FunctionalInterface {

	public static void main(String[] args) {
	//	B b=new B();
	//	b.print();
		
		
//length of code decreased using Lamda expression 
A obj=()->
{
	System.out.println("Functional interface implementation using lamda expression");

};
obj.print();

	}
	}


